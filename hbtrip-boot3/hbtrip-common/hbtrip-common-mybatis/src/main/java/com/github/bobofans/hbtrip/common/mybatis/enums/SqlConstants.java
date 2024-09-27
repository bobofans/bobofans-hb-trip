/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/25
 */
package com.github.bobofans.hbtrip.common.mybatis.enums;

import com.baomidou.mybatisplus.annotation.DbType;

/**
 * <p>SQL相关常量类</p>
 * @author shencb
 * @version 1.0.0  2024/9/25 shencb $
 */
public class SqlConstants {

    /**
     * 数据库的类型
     */
    public static DbType DB_TYPE;

    public static void init(DbType dbType) {
        DB_TYPE = dbType;
    }

}
