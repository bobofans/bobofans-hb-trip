/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/23
 */
package com.bobofans.business.trip.common.mybatis;

import lombok.extern.slf4j.Slf4j;
import com.p6spy.engine.spy.appender.StdoutLogger;

/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/23 shencb $
 */
@Slf4j
public class StdLog4jLogger extends StdoutLogger{

    @Override
    public void logException(Exception e) {
        log.error("", e);
    }

    @Override
    public void logText(String text) {
        log.info(text);
    }
}
