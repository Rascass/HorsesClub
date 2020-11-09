package com.java.automation.lab.fall.antonyuk.core22.domain.ammunition;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SaddleService {

    public static synchronized void update(Saddle saddle, String field, Integer value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = saddle.getClass().getDeclaredMethod(field, Integer.class);
        method.setAccessible(true);
        method.invoke(saddle, value);
    }

    public static synchronized void update(Saddle saddle, String field, Double value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = saddle.getClass().getDeclaredMethod(field, Double.class);
        method.setAccessible(true);
        method.invoke(saddle, value);
    }

    public static synchronized void update(Saddle saddle, String field, SaddleType value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = saddle.getClass().getDeclaredMethod(field, SaddleType.class);
        method.setAccessible(true);
        method.invoke(saddle, value);
    }
}
