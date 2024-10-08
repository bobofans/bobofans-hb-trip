/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/23
 */
package com.github.bobofans.hbtrip.common.core.enums;

import cn.hutool.core.util.ArrayUtil;
import com.github.bobofans.hbtrip.common.core.colloction.IntArrayValuable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * <p>时间间隔的枚举</p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/23 shencb $
 */
@Getter
@AllArgsConstructor
public enum DateIntervalEnum implements IntArrayValuable {

    DAY(1, "天"),
    WEEK(2, "周"),
    MONTH(3, "月"),
    QUARTER(4, "季度"),
    YEAR(5, "年")
    ;

    public static final int[] ARRAYS = Arrays.stream(values()).mapToInt(DateIntervalEnum::getInterval).toArray();

    /**
     * 类型
     */
    private final Integer interval;
    /**
     * 名称
     */
    private final String name;

    @Override
    public int[] array() {
        return ARRAYS;
    }

    public static DateIntervalEnum valueOf(Integer interval) {
        return ArrayUtil.firstMatch(item -> item.getInterval().equals(interval), DateIntervalEnum.values());
    }

}
