/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/25
 */
package com.github.bobofans.hbtrip.system.sms.api.dto.list;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>短信模板展现</p>
 * @author shencb
 * @version 1.0.0  2024/9/25 shencb $
 */
@Data
@Accessors(chain = true)
public class SmsModelDto {

    /** 主键 */
    private Long id;

    /** 短信模版code */
    private String smsCode;

    /** 短信分类 */
    private String smsType;

    /** 短信标题 */
    private String smsTitle;

    /** 短信模版内容 */
    private String smsContent;

    private String status;

    /** 外部短信模板编码 */
    private String templateCode;

    /** 需排除的占位符 */
    private String excludePlaceholder;

    private Date gmtCreate;

    private Date gmtModify;
}
