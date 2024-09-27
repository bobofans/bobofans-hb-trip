/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.github.bobofans.hbtrip.system.mail.api;

import com.github.bobofans.hbtrip.system.mail.api.dto.MailSendSingleToUserReqDTO;
import jakarta.validation.Valid;

/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
public interface MailSendApi {

    /**
     * 发送单条邮箱给 Admin 用户
     *
     * 在 mail 为空时，使用 userId 加载对应 Admin 的邮箱
     *
     * @param reqDTO 发送请求
     * @return 发送日志编号
     */
    Long sendSingleMailToAdmin(@Valid MailSendSingleToUserReqDTO reqDTO);

    /**
     * 发送单条邮箱给 Member 用户
     *
     * 在 mail 为空时，使用 userId 加载对应 Member 的邮箱
     *
     * @param reqDTO 发送请求
     * @return 发送日志编号
     */
    Long sendSingleMailToMember(@Valid MailSendSingleToUserReqDTO reqDTO);

}
