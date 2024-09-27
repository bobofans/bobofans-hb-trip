/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/18
 */
package com.github.bobofans.hbtrip.codegen.export;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/18 shencb $
 */
@Slf4j
@SpringBootTest
public class CodeGenerateTest {

    @Autowired
    private IGenerate fastCodeGenerate;

    @Test
    public void testGenerate() {
        log.info("testGenerate");
        fastCodeGenerate.generate();
    }

}
