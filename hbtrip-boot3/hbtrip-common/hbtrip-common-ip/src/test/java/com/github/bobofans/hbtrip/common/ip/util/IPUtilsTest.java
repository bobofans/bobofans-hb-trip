/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/23
 */
package com.github.bobofans.hbtrip.common.ip.util;

import com.github.bobofans.hbtrip.common.ip.entity.Area;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.lionsoul.ip2region.xdb.Searcher;


import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/23 shencb $
 */
@Slf4j
public class IPUtilsTest {

    @Test
    public void testGetAreaId_string() {
        // 120.202.4.0|120.202.4.255|420600
        Integer areaId = IPUtils.getAreaId("120.202.4.50");
        assertEquals(420600, areaId);
        log.info("areaId:{}", areaId);
    }

    @Test
    public void testGetAreaId_long() throws Exception {
        // 120.203.123.0|120.203.133.255|360900
        long ip = Searcher.checkIP("120.203.123.250");
        Integer areaId = IPUtils.getAreaId(ip);
        assertEquals(360900, areaId);
    }

    @Test
    public void testGetArea_string() {
        // 120.202.4.0|120.202.4.255|420600
        Area area = IPUtils.getArea("120.202.4.50");
        assertEquals("襄阳市", area.getName());
    }

    @Test
    public void testGetArea_long() throws Exception {
        // 120.203.123.0|120.203.133.255|360900
        long ip = Searcher.checkIP("120.203.123.252");
        Area area = IPUtils.getArea(ip);
        assertEquals("宜春市", area.getName());
    }

}
