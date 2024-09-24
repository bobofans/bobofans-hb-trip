/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.bobofans.business.framework.common.util.number;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.StrUtil;

import java.math.BigDecimal;

/**
 * <p>数字的工具类</p>
 * 补全 {@link cn.hutool.core.util.NumberUtil} 的功能
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
public class NumberUtils {

    public static Long parseLong(String str) {
        return StrUtil.isNotEmpty(str) ? Long.valueOf(str) : null;
    }

    public static Integer parseInt(String str) {
        return StrUtil.isNotEmpty(str) ? Integer.valueOf(str) : null;
    }


    /**
     * 提供精确的乘法运算
     * 和 hutool {@link NumberUtil#mul(BigDecimal...)} 的差别是，如果存在 null，则返回 null
     *
     * @param values 多个被乘值
     * @return 积
     */
    public static BigDecimal mul(BigDecimal... values) {
        for (BigDecimal value : values) {
            if (value == null) {
                return null;
            }
        }
        return NumberUtil.mul(values);
    }

}

