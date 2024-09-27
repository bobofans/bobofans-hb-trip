/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.github.bobofans.hbtrip.system.sms.api;

import com.github.bobofans.hbtrip.common.core.exception.ServiceException;
import com.github.bobofans.hbtrip.system.sms.api.dto.send.SmsSendSingleToUserReqDTO;
import jakarta.validation.Valid;

/**
 * <p>短信发送 API 接口</p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
public interface SmsSendApi {

    /**
     * 发送单条短信给 Admin 用户
     * 在 mobile 为空时，使用 userId 加载对应 Admin 的手机号
     * 如果错误，则抛出 {@link ServiceException} 异常
     * @param reqDTO 发送请求
     * @return 发送日志编号
     */
    Long sendSingleSmsToAdmin(@Valid SmsSendSingleToUserReqDTO reqDTO);

    /**
     * 发送单条短信给 Member 用户
     * 在 mobile 为空时，使用 userId 加载对应 Member 的手机号
     * 如果错误，则抛出 {@link ServiceException} 异常
     * @param reqDTO 发送请求
     * @return 发送日志编号
     */
    Long sendSingleSmsToMember(@Valid SmsSendSingleToUserReqDTO reqDTO);

}
