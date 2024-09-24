/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.bobofans.business.framework.common.util.io;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.StrUtil;

import java.io.InputStream;

/**
 * <p>IO 工具类</p>
 * 用于 {@link cn.hutool.core.io.IoUtil} 缺失的方法
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
public class IoUtils {

    /**
     * 从流中读取 UTF8 编码的内容
     *
     * @param in 输入流
     * @param isClose 是否关闭
     * @return 内容
     * @throws IORuntimeException IO 异常
     */
    public static String readUtf8(InputStream in, boolean isClose) throws IORuntimeException {
        return StrUtil.utf8Str(IoUtil.read(in, isClose));
    }

}
