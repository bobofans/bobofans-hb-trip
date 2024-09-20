/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/20
 */
package com.bobofans.business.trip.common.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * <p>自动填充表中创建时间和修改时间字段</p>
 * @see <a href="https://mp.baomidou.com/guide/auto-fill-metainfo.html">MetaObjectHandler</a>
 * @author shencb
 * @version 1.0.0  2024/9/20 shencb $
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill....");
        this.strictInsertFill(metaObject, "gmtCreate", LocalDateTime.class,LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill....");
        this.strictUpdateFill(metaObject, "gmtModify", LocalDateTime.class, LocalDateTime.now());
    }
}
