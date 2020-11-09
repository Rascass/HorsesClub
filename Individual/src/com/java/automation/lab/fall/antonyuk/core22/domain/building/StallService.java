package com.java.automation.lab.fall.antonyuk.core22.domain.building;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StallService {

    public static synchronized void update(Stall stall, String field, Integer value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = stall.getClass().getDeclaredMethod(field, Integer.class);
        method.setAccessible(true);
        method.invoke(method, value);
    }

    public static synchronized void update(Stall stall, String field, Boolean value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = stall.getClass().getDeclaredMethod(field, Boolean.class);
        method.setAccessible(true);
        method.invoke(method, value);
    }
}
