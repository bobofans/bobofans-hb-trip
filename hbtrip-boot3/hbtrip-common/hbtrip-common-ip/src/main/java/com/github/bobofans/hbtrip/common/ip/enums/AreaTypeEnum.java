/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/23
 */
package com.github.bobofans.hbtrip.common.ip.enums;

import com.github.bobofans.hbtrip.common.core.colloction.IntArrayValuable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * <p>区域类型枚举</p>
 * @author shencb
 * @version 1.0.0  2024/9/23 shencb $
 */
@AllArgsConstructor
@Getter
public enum AreaTypeEnum implements IntArrayValuable {

    COUNTRY(1, "国家"),
    PROVINCE(2, "省份"),
    CITY(3, "城市"),
    DISTRICT(4, "地区"), // 县、镇、区等
    ;

    public static final int[] ARRAYS = Arrays.stream(values()).mapToInt(AreaTypeEnum::getType).toArray();

    /**
     * 类型
     */
    private final Integer type;
    /**
     * 名字
     */
    private final String name;

    /**
     * @return int 数组
     */
    @Override
    public int[] array() {
        return ARRAYS;
    }
}