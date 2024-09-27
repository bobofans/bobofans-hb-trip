/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.github.bobofans.hbtrip.common.core.util.collection;

import com.github.bobofans.hbtrip.common.core.util.collection.CollectionUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
@Slf4j
public class CollectionUtilsTest {

    @Data
    @AllArgsConstructor
    private static class Dog {

        private Integer id;
        private String name;
        private String code;

    }

    @Test
    public void testContainsAny(){
        // 准备参数
        Dog dog1=new Dog(1, "花花", "hh");
        Dog dog2=new Dog(2, "旺财", "wc");

        Dog dog=new Dog(1, "花花", "hh");

        boolean isContaions = CollectionUtils.containsAny(dog, dog1,dog2);
        log.info("isContaions: {}", isContaions);
        assertEquals(isContaions, true);

        List<Dog> list=Arrays.asList(dog1,dog2);
        boolean isContaions2 = CollectionUtils.containsAny(dog, list);
        log.info("isContaions2: {}", isContaions2);
    }


    @Test
    public void testDiffList() {
        // 准备参数
        Collection<Dog> oldList = Arrays.asList(
                new Dog(1, "花花", "hh"),
                new Dog(2, "旺财", "wc")
        );
        Collection<Dog> newList = Arrays.asList(
                new Dog(null, "花花2", "hh"),
                new Dog(null, "小白", "xb")
        );
        BiFunction<Dog, Dog, Boolean> sameFunc = (oldObj, newObj) -> {
            boolean same = oldObj.getCode().equals(newObj.getCode());
            // 如果相等的情况下，需要设置下 id，后续好更新
            if (same) {
                newObj.setId(oldObj.getId());
            }
            return same;
        };

        // 调用
        List<List<Dog>> result = CollectionUtils.diffList(oldList, newList, sameFunc);
        // 断言
        assertEquals(result.size(), 3);
        // 断言 create
        assertEquals(result.get(0).size(), 1);
        assertEquals(result.get(0).get(0), new Dog(null, "小白", "xb"));
        // 断言 update
        assertEquals(result.get(1).size(), 1);
        assertEquals(result.get(1).get(0), new Dog(1, "花花2", "hh"));
        // 断言 delete
        assertEquals(result.get(2).size(), 1);
        assertEquals(result.get(2).get(0), new Dog(2, "旺财", "wc"));

        //打印结果值
        log.info("result: {}", result);
    }



}
