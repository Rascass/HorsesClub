package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class RiderFactory {

    public static synchronized void update(Rider rider, String field, Category value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = rider.getClass().getDeclaredMethod(field, Category.class);
        method.setAccessible(true);
        method.invoke(rider, value);
    }

    public static synchronized void update(Rider rider, String field, String value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = rider.getClass().getDeclaredMethod(field, String.class);
        method.setAccessible(true);
        method.invoke(rider, value);
    }
    public static synchronized void update(Rider rider, String field, Date value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = rider.getClass().getDeclaredMethod(field, Date.class);
        method.setAccessible(true);
        method.invoke(rider, value);
    }

    public static synchronized void update(Rider rider, String field, Gender value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = rider.getClass().getDeclaredMethod(field, Gender.class);
        method.setAccessible(true);
        method.invoke(rider, value);
    }
}
