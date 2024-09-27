/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/25
 */
package com.github.bobofans.hbtrip.common.mybatis.type;

import com.github.bobofans.hbtrip.common.core.util.json.JsonUtils;
import com.baomidou.mybatisplus.extension.handlers.AbstractJsonTypeHandler;
import com.fasterxml.jackson.core.type.TypeReference;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * 参考 {@link com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler} 实现
 * 在我们将字符串反序列化为 Set 并且泛型为 Long 时，如果每个元素的数值太小，会被处理成 Integer 类型，导致可能存在隐性的 BUG。
 * 例如说哦，SysUserDO 的 postIds 属性
 * @author shencb
 * @version 1.0.0  2024/9/25 shencb $
 */
public class JsonLongSetTypeHandler extends AbstractJsonTypeHandler <Object> {

    private static final TypeReference<Set<Long>> TYPE_REFERENCE = new TypeReference<Set<Long>>(){};

    public JsonLongSetTypeHandler(Class<?> type) {
        super(type);
    }

    public JsonLongSetTypeHandler(Class<?> type, Field field) {
        super(type, field);
    }

    @Override
    public Object parse(String json) {
        return JsonUtils.parseObject(json, TYPE_REFERENCE);
    }

    @Override
    public String toJson(Object obj) {
        return JsonUtils.toJsonString(obj);
    }

}
