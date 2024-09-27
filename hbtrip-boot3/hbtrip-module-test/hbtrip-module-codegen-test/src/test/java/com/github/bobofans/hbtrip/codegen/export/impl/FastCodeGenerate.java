/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/20
 */
package com.github.bobofans.hbtrip.codegen.export.impl;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.fill.Property;
import com.github.bobofans.hbtrip.codegen.export.IGenerate;
import com.github.bobofans.hbtrip.codegen.export.config.ExportConfigInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/20 shencb $
 */
@Slf4j
@Component
public class FastCodeGenerate implements IGenerate {


    @Autowired
    private ExportConfigInfo exportConfig;




    /**
     * 生成数据
     */
    @Override
    public void generate() {
        log.info("开始生成代码,其配置信息为：" + exportConfig.toString());
        FastAutoGenerator.create(exportConfig.getUrl(), exportConfig.getUsername(), exportConfig.getPassword())
                .globalConfig(builder -> {
                    builder.author(exportConfig.getAuthor())
                            .disableOpenDir()
                            .outputDir(exportConfig.getProjectPath() + "/src/main/java")
                            .commentDate("yyyy-MM-dd HH:mm:ss");

                })
                .packageConfig(builder -> {
                    builder.parent(exportConfig.getPackageName())
                            .moduleName(exportConfig.getModuleName())
                            .entity("entity")
                            .mapper("mapper")
                            .service("dao")
                            .serviceImpl("dao.impl")
                            .xml("mapper.xml");
                })
//                .injectionConfig(consumer -> {
//                    Map<String, String> customFile = new HashMap<>();
//                    // DTO
//                    customFile.put("DTO.java", "/templates/entityDTO.java.ftl");
//                    consumer.customFile(customFile);
//                })
                .strategyConfig(builder -> {
                    builder.addInclude(exportConfig.getTables().split(","))
                            .entityBuilder()
                            .javaTemplate("templates/entity.java")
                            .enableFileOverride()
                            .disableSerialVersionUID()
                            .enableLombok()
                            .enableChainModel()
                            .enableTableFieldAnnotation()
                            .naming(NamingStrategy.underline_to_camel)
                            .columnNaming(NamingStrategy.underline_to_camel)
                            .addTableFills(new Column("gmt_create", FieldFill.INSERT))
                            .addTableFills(new Property("gmtModify", FieldFill.INSERT_UPDATE))
                            .idType(IdType.AUTO)
                            .versionColumnName("version")
                            .logicDeleteColumnName("is_delete")
                            .formatFileName("%sEntity")
                            .mapperBuilder()
                            .mapperTemplate("templates/mapper.java")
                            .mapperXmlTemplate("templates/mapper.xml")
                            .mapperAnnotation(Mapper.class)
                            .serviceBuilder()
                            .serviceImplTemplate("templates/dao.java")
                            .serviceImplTemplate("templates/daoImpl.java")
                            .formatServiceFileName("%sDao")
                            .formatServiceImplFileName("%sDaoImpl")
                            .controllerBuilder().disable();
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
        log.info("代码生成完毕");
    }

}
