package com.java.automation.lab.fall.antonyuk.core22.domain.horse;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Ammunition;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StallionService {
    public static synchronized void update(Stallion stallion, String field, String value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = stallion.getClass().getDeclaredMethod(field, String.class);
        method.setAccessible(true);
        method.invoke(stallion, value);
    }

    public static synchronized void update(Stallion stallion, String field, Integer value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = stallion.getClass().getDeclaredMethod(field, Integer.class);
        method.setAccessible(true);
        method.invoke(stallion, value);
    }

    public static synchronized void update(Stallion stallion, String field, Specialization value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = stallion.getClass().getDeclaredMethod(field, Specialization.class);
        method.setAccessible(true);
        method.invoke(stallion, value);
    }

    public static synchronized void update(Stallion stallion, String field, Ammunition value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = stallion.getClass().getDeclaredMethod(field, Ammunition.class);
        method.setAccessible(true);
        method.invoke(stallion, value);
    }

    public static synchronized void update(Stallion stallion, String field, HorseSuit value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = stallion.getClass().getDeclaredMethod(field, HorseSuit.class);
        method.setAccessible(true);
        method.invoke(stallion, value);
    }

    public static synchronized void update(Stallion stallion, String field, Pedigree value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = stallion.getClass().getDeclaredMethod(field, Pedigree.class);
        method.setAccessible(true);
        method.invoke(stallion, value);
    }

    public static synchronized void update(Stallion stallion, String field, Boolean value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = stallion.getClass().getDeclaredMethod(field, Boolean.class);
        method.setAccessible(true);
        method.invoke(stallion, value);
    }
}
