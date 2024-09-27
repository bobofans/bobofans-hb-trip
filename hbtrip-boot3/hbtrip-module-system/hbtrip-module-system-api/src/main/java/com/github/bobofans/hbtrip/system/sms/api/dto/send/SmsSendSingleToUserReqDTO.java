/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.github.bobofans.hbtrip.system.sms.api.dto.send;

import com.github.bobofans.hbtrip.common.core.validation.Mobile;
import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import java.util.Map;

/**
 * <p>短信发送给 Admin 或者 Member 用户</p>
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
@Data
public class SmsSendSingleToUserReqDTO {

    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 手机号
     */
    @Mobile
    private String mobile;
    /**
     * 短信模板编号
     */
    @NotEmpty(message = "短信模板编号不能为空")
    private String templateCode;

    /** 模板参数*/
    private Map<String, Object> templateParams;

}
