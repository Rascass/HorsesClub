package com.java.automation.lab.fall.antonyuk.core22.service;

import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Stallion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StallionService {
    public static synchronized <T> void update(Stallion stallion, String field, Class<T> value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = stallion.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.invoke(stallion, value);
    }
}
