/*
 * bobofans Inc.
 * Copyright (c) 2007-2024 All Rights Reserved.
 * Author     :shencb
 * Version    :1.0
 * Create Date:2024/9/24
 */
package com.github.bobofans.hbtrip.common.core.validation;

import com.github.bobofans.hbtrip.common.core.colloction.IntArrayValuable;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;
/**
 * <p></p>
 *
 * @author shencb
 * @version 1.0.0  2024/9/24 shencb $
 */
@Target({
        ElementType.METHOD,
        ElementType.FIELD,
        ElementType.ANNOTATION_TYPE,
        ElementType.CONSTRUCTOR,
        ElementType.PARAMETER,
        ElementType.TYPE_USE
})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {InEnumValidator.class, InEnumCollectionValidator.class}
)
public @interface InEnum {

    /**
     * @return 实现 EnumValuable 接口的
     */
    Class<? extends IntArrayValuable> value();

    String message() default "必须在指定范围 {value}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
