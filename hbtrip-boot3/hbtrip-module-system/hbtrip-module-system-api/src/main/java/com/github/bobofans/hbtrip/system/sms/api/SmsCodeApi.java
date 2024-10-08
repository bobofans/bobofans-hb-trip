/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.github.bobofans.hbtrip.system.sms.api;

import com.github.bobofans.hbtrip.common.core.exception.ServiceException;
import com.github.bobofans.hbtrip.system.sms.api.dto.code.SmsCodeSendReqDTO;
import com.github.bobofans.hbtrip.system.sms.api.dto.code.SmsCodeUseReqDTO;
import com.github.bobofans.hbtrip.system.sms.api.dto.code.SmsCodeValidateReqDTO;
import jakarta.validation.Valid;
/**
 * <p>短信验证码 API 接口</p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
public interface SmsCodeApi {

    /**
     * 创建短信验证码，并进行发送
     * 如果错误，则抛出 {@link ServiceException} 异常
     * @param reqDTO 发送请求
     */
    void sendSmsCode(@Valid SmsCodeSendReqDTO reqDTO);

    /**
     * 验证短信验证码，并进行使用
     * 如果正确，则将验证码标记成已使用
     * 如果错误，则抛出 {@link ServiceException} 异常
     *
     * @param reqDTO 使用请求
     */
    void useSmsCode(@Valid SmsCodeUseReqDTO reqDTO);

    /**
     * 检查验证码是否有效
     * 如果错误，则抛出 {@link ServiceException} 异常
     * @param reqDTO 校验请求
     */
    void validateSmsCode(@Valid SmsCodeValidateReqDTO reqDTO);

}
