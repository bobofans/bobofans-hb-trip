/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.bobofans.business.trip.system.api.mail.dto;

import lombok.Data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import java.util.Map;

/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
@Data
public class MailSendSingleToUserReqDTO {

    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 邮箱
     */
    @Email
    private String mail;

    /**
     * 邮件模板编号
     */
    @NotNull(message = "邮件模板编号不能为空")
    private String templateCode;
    /**
     * 邮件模板参数
     */
    private Map<String, Object> templateParams;

}
