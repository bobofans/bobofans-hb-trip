/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/23
 */
package com.bobofans.business.trip.framework.ip.utils;

import com.bobofans.business.trip.framework.ip.entity.Area;
import com.bobofans.business.trip.framework.ip.enums.AreaTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/23 shencb $
 */
@Slf4j
public class AreaUtilsTest {

    @Test
    public void testGetArea() {
        // 调用：北京
        Area area = AreaUtils.getArea(110100);
        // 断言
        assertEquals(area.getId(), 110100);
        assertEquals(area.getName(), "北京市");
        assertEquals(area.getType(), AreaTypeEnum.CITY.getType());
        assertEquals(area.getParent().getId(), 110000);
        assertEquals(area.getChildren().size(), 16);
        log.info("地区信息:{}",area.getName());
        log.info("地区信息:{}",area.getType());
    }

    @Test
    public void testFormat() {
        log.info("格式化结果:{}", AreaUtils.format(110105));
        assertEquals(AreaUtils.format(110105), "北京 北京市 朝阳区");
        assertEquals(AreaUtils.format(1), "中国");
        assertEquals(AreaUtils.format(2), "蒙古");
    }
}
