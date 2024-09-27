package com.github.bobofans.hbtrip.codegen.convert;

import com.github.bobofans.hbtrip.common.core.util.collection.CollectionUtils;
import com.github.bobofans.hbtrip.common.core.util.object.BeanUtils;
import com.github.bobofans.hbtrip.codegen.vo.CodegenDetailRespVO;
import com.github.bobofans.hbtrip.codegen.vo.CodegenPreviewRespVO;
import com.github.bobofans.hbtrip.codegen.vo.column.CodegenColumnRespVO;
import com.github.bobofans.hbtrip.codegen.vo.table.CodegenTableRespVO;
import com.github.bobofans.hbtrip.codegen.entity.CodegenColumnDO;
import com.github.bobofans.hbtrip.codegen.entity.CodegenTableDO;
import com.baomidou.mybatisplus.generator.config.po.TableField;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import org.apache.ibatis.type.JdbcType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Map;

@Mapper
public interface CodegenConvert {

    CodegenConvert INSTANCE = Mappers.getMapper(CodegenConvert.class);

    // ========== TableInfo 相关 ==========

    @Mappings({
            @Mapping(source = "name", target = "tableName"),
            @Mapping(source = "comment", target = "tableComment"),
    })
    CodegenTableDO convert(TableInfo bean);

    List<CodegenColumnDO> convertList(List<TableField> list);

    @Mappings({
            @Mapping(source = "name", target = "columnName"),
            @Mapping(source = "metaInfo.jdbcType", target = "dataType", qualifiedByName = "getDataType"),
            @Mapping(source = "comment", target = "columnComment"),
            @Mapping(source = "metaInfo.nullable", target = "nullable"),
            @Mapping(source = "keyFlag", target = "primaryKey"),
            @Mapping(source = "columnType.type", target = "javaType"),
            @Mapping(source = "propertyName", target = "javaField"),
    })
    CodegenColumnDO convert(TableField bean);

    @Named("getDataType")
    default String getDataType(JdbcType jdbcType) {
        return jdbcType.name();
    }

    // ========== 其它 ==========

//    default CodegenDetailRespVO convert(CodegenTableDO table, List<CodegenColumnDO> columns) {
//        CodegenDetailRespVO respVO = new CodegenDetailRespVO();
//        respVO.setTable(BeanUtils.toBean(table, CodegenTableRespVO.class));
//        respVO.setColumns(BeanUtils.toBean(columns, CodegenColumnRespVO.class));
//        return respVO;
//    }
//
//    default List<CodegenPreviewRespVO> convert(Map<String, String> codes) {
//        return CollectionUtils.convertList(codes.entrySet(),
//                entry -> new CodegenPreviewRespVO().setFilePath(entry.getKey()).setCode(entry.getValue()));
//    }

}
