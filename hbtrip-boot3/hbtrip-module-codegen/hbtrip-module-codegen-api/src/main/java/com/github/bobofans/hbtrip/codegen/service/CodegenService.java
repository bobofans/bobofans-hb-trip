/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/26
 */
package com.github.bobofans.hbtrip.codegen.service;


import com.github.bobofans.hbtrip.common.mybatis.pojo.PageResult;
import com.github.bobofans.hbtrip.codegen.vo.CodegenCreateListReqVO;
import com.github.bobofans.hbtrip.codegen.vo.CodegenUpdateReqVO;
import com.github.bobofans.hbtrip.codegen.vo.table.CodegenTablePageReqVO;
import com.github.bobofans.hbtrip.codegen.vo.table.DatabaseTableRespVO;
import com.github.bobofans.hbtrip.codegen.entity.CodegenColumnDO;
import com.github.bobofans.hbtrip.codegen.entity.CodegenTableDO;

import java.util.List;
import java.util.Map;

/**
 * <p>代码生成 Service 接口</p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/26 shencb $
 */
public interface CodegenService {

    /**
     * 基于数据库的表结构，创建代码生成器的表定义
     *
     * @param userId 用户编号
     * @param reqVO 表信息
     * @return 创建的表定义的编号数组
     */
    List<Long> createCodegenList(Long userId, CodegenCreateListReqVO reqVO);

    /**
     * 更新数据库的表和字段定义
     *
     * @param updateReqVO 更新信息
     */
    void updateCodegen(CodegenUpdateReqVO updateReqVO);

    /**
     * 基于数据库的表结构，同步数据库的表和字段定义
     *
     * @param tableId 表编号
     */
    void syncCodegenFromDB(Long tableId);

    /**
     * 删除数据库的表和字段定义
     *
     * @param tableId 数据编号
     */
    void deleteCodegen(Long tableId);

    /**
     * 获得表定义列表
     *
     * @param dataSourceConfigId 数据源配置的编号
     * @return 表定义列表
     */
    List<CodegenTableDO> getCodegenTableList(Long dataSourceConfigId);

    /**
     * 获得表定义分页
     *
     * @param pageReqVO 分页条件
     * @return 表定义分页
     */
    PageResult<CodegenTableDO> getCodegenTablePage(CodegenTablePageReqVO pageReqVO);

    /**
     * 获得表定义
     *
     * @param id 表编号
     * @return 表定义
     */
    CodegenTableDO getCodegenTable(Long id);

    /**
     * 获得指定表的字段定义数组
     *
     * @param tableId 表编号
     * @return 字段定义数组
     */
    List<CodegenColumnDO> getCodegenColumnListByTableId(Long tableId);

    /**
     * 执行指定表的代码生成
     *
     * @param tableId 表编号
     * @return 生成结果。key 为文件路径，value 为对应的代码内容
     */
    Map<String, String> generationCodes(Long tableId);

    /**
     * 获得数据库自带的表定义列表
     *
     * @param dataSourceConfigId 数据源的配置编号
     * @param name 表名称
     * @param comment 表描述
     * @return 表定义列表
     */
    List<DatabaseTableRespVO> getDatabaseTableList(Long dataSourceConfigId, String name, String comment);

}
