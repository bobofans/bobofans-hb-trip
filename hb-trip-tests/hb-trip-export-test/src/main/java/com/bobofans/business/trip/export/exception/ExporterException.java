/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/13
 */
package com.bobofans.business.trip.export.exception;

/**
 * <p>导出代码异常</p>
 * @author shencb
 * @version $Id: ExporterException.java 2011-4-2 上午11:41:50 shencb $
 */
public class ExporterException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 6513557946820094110L;

    /**
     * 默认构造函数
     */
    public ExporterException() {
        super();
    }

    /**
     * 带参数默认构造函数
     * @param message 异常消息
     */
    public ExporterException(String message) {
        super(message);
    }

    /**
     * 构造函数
     * @param message 异常消息
     * @param cause 异常链
     */
    public ExporterException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造函数
     * @param cause 异常链
     */
    public ExporterException(Throwable cause) {
        super(cause);
    }
}
