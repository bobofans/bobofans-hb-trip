/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.bobofans.business.trip.system.biz.sms;

import com.bobofans.business.framework.common.exception.ServiceException;
import com.bobofans.business.trip.system.api.sms.SmsCodeApi;
import com.bobofans.business.trip.system.api.sms.dto.code.SmsCodeSendReqDTO;
import com.bobofans.business.trip.system.api.sms.dto.code.SmsCodeUseReqDTO;
import com.bobofans.business.trip.system.api.sms.dto.code.SmsCodeValidateReqDTO;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
@Service
@Validated
public class SmsCodeApiImpl implements SmsCodeApi {


    /**
     * 创建短信验证码，并进行发送
     * 如果错误，则抛出 {@link ServiceException} 异常
     *
     * @param reqDTO 发送请求
     */
    @Override
    public void sendSmsCode(SmsCodeSendReqDTO reqDTO) {

    }

    /**
     * 验证短信验证码，并进行使用
     * 如果正确，则将验证码标记成已使用
     * 如果错误，则抛出 {@link ServiceException} 异常
     *
     * @param reqDTO 使用请求
     */
    @Override
    public void useSmsCode(SmsCodeUseReqDTO reqDTO) {

    }

    /**
     * 检查验证码是否有效
     * 如果错误，则抛出 {@link ServiceException} 异常
     *
     * @param reqDTO 校验请求
     */
    @Override
    public void validateSmsCode(SmsCodeValidateReqDTO reqDTO) {

    }
}
