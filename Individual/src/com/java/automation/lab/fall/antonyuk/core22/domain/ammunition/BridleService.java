package com.java.automation.lab.fall.antonyuk.core22.domain.ammunition;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BridleService {

    public static synchronized void update(Bridle bridle, String field, Integer value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = bridle.getClass().getDeclaredMethod(field, Integer.class);
        method.setAccessible(true);
        method.invoke(bridle, value);
    }

    public static synchronized void update(Bridle bridle, String field, BridleType value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = bridle.getClass().getDeclaredMethod(field, BridleType.class);
        method.setAccessible(true);
        method.invoke(bridle, value);
    }

    public static synchronized void update(Bridle bridle, String field, BridleSize value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = bridle.getClass().getDeclaredMethod(field, BridleSize.class);
        method.setAccessible(true);
        method.invoke(bridle, value);
    }
}
