package com.java.automation.lab.fall.antonyuk.core22.service.concreteService;

import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Mare;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MareService {
    public static synchronized <T> void update(Mare mare, String field, T value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = mare.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.invoke(mare, value);
    }
}
