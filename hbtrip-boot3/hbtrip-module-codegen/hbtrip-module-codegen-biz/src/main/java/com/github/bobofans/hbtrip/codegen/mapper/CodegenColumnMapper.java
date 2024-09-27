package com.github.bobofans.hbtrip.codegen.mapper;

import com.github.bobofans.hbtrip.common.mybatis.mapper.BaseMapperX;
import com.github.bobofans.hbtrip.common.mybatis.query.LambdaQueryWrapperX;
import com.github.bobofans.hbtrip.codegen.entity.CodegenColumnDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CodegenColumnMapper extends BaseMapperX<CodegenColumnDO> {

    default List<CodegenColumnDO> selectListByTableId(Long tableId) {
        return selectList(new LambdaQueryWrapperX<CodegenColumnDO>()
                .eq(CodegenColumnDO::getTableId, tableId)
                .orderByAsc(CodegenColumnDO::getId));
    }

    default void deleteListByTableId(Long tableId) {
        delete(new LambdaQueryWrapperX<CodegenColumnDO>()
                .eq(CodegenColumnDO::getTableId, tableId));
    }

}
