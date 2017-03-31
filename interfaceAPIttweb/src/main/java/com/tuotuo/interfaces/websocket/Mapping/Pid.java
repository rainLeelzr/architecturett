package com.tuotuo.interfaces.websocket.Mapping;

import com.tuotuo.commontt.util.PidValue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * pid
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Pid {

    PidValue value();
}
