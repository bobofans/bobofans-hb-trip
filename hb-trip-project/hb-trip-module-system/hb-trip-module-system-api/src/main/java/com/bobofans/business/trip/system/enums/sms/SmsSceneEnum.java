/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.bobofans.business.trip.system.enums.sms;

import cn.hutool.core.util.ArrayUtil;
import com.bobofans.business.framework.common.core.IntArrayValuable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * <p>用户短信验证码发送场景的枚举</p>
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
@Getter
@AllArgsConstructor
public enum SmsSceneEnum implements IntArrayValuable {

    MEMBER_LOGIN(1, "user-sms-login", "会员用户 - 手机号登陆"),
    MEMBER_UPDATE_MOBILE(2, "user-update-mobile", "会员用户 - 修改手机"),
    MEMBER_UPDATE_PASSWORD(3, "user-update-password", "会员用户 - 修改密码"),
    MEMBER_RESET_PASSWORD(4, "user-reset-password", "会员用户 - 忘记密码"),

    ADMIN_MEMBER_LOGIN(21, "admin-sms-login", "后台用户 - 手机号登录");

    public static final int[] ARRAYS = Arrays.stream(values()).mapToInt(SmsSceneEnum::getScene).toArray();

    /**
     * 验证场景的编号
     */
    private final Integer scene;
    /**
     * 模版编码
     */
    private final String templateCode;
    /**
     * 描述
     */
    private final String description;

    @Override
    public int[] array() {
        return ARRAYS;
    }

    public static SmsSceneEnum getCodeByScene(Integer scene) {
        return ArrayUtil.firstMatch(sceneEnum -> sceneEnum.getScene().equals(scene),
                values());
    }

}
