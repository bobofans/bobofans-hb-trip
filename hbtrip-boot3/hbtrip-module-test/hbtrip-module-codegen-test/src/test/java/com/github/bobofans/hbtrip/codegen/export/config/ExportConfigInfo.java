/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/18
 */
package com.github.bobofans.hbtrip.codegen.export.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/18 shencb $
 */
@Slf4j
@Data
@PropertySource("classpath:export_config.properties")
@Component
public class ExportConfigInfo {

    /** 连接URL  */
    @Value("${database.url}")
    private String url;

    /** 数据库用户名   */
    @Value("${database.username}")
    private String username;

    /** 数据库密码  */
    @Value("${database.password}")
    private String password;

    /** 项目目录  */
    @Value("${project.path}")
    private String projectPath;

    /** 模块名称  */
    @Value("${project.module_name}")
    private String moduleName;

    /** 作者名称  */
    @Value("${project.author}")
    private String author;

    /** 基础包路径  */
    @Value("${project.package_name}")
    private String packageName;

    /** 需要生成的表  */
    @Value("${export.tables}")
    private String tables;

}
