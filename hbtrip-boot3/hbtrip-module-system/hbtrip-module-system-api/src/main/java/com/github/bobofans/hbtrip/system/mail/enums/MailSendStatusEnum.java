/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.github.bobofans.hbtrip.system.mail.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>邮件的发送状态枚举</p>
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
@Getter
@AllArgsConstructor
public enum MailSendStatusEnum {

    INIT(0), // 初始化
    SUCCESS(10), // 发送成功
    FAILURE(20), // 发送失败
    IGNORE(30), // 忽略，即不发送
    ;

    private final int status;

}
