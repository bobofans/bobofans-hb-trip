/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/20
 */
package com.bobofans.business.trip.test;

import com.bobofans.business.trip.test.dao.BlAlterAccountApplyDao;
import com.bobofans.business.trip.test.entity.BlAlterAccountApplyEntity;
import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.MockConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/20 shencb $
 */
@Slf4j
@SpringBootTest
@Rollback(false)
public class BlAlterAccountApplyDaoTest {

    @Autowired
    private BlAlterAccountApplyDao blAlterAccountApplyDao;

    @Test
    public void blAlterAccountApplyDaoTest() {
        MockConfig mockConfig = new MockConfig()
                .subConfig("status")
                .stringRegex("[01]?")
                .subConfig("isNeedReview")
                .stringRegex("[01]?")
                .globalConfig();


        BlAlterAccountApplyEntity entity = JMockData.mock(BlAlterAccountApplyEntity.class,mockConfig);
        log.info("insert entity:{}",entity);


        blAlterAccountApplyDao.save(entity);
        log.info("saveentity:{}",entity);

        long count =blAlterAccountApplyDao.count();
        log.info("count:{}",count);
    }
}
