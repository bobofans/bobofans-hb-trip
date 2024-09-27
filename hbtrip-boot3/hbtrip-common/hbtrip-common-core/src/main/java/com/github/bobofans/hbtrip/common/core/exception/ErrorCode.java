/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.github.bobofans.hbtrip.common.core.exception;

import lombok.Data;

/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
@Data
public class ErrorCode {

    /**
     * 错误码
     */
    private final Integer code;
    /**
     * 错误提示
     */
    private final String msg;

    public ErrorCode(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }

}
