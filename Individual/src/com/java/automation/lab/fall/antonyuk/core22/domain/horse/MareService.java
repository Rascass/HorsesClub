package com.java.automation.lab.fall.antonyuk.core22.domain.horse;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Ammunition;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MareService {

    public static synchronized void update(Mare mare, String field, String value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = mare.getClass().getDeclaredMethod(field, String.class);
        method.setAccessible(true);
        method.invoke(mare, value);
    }

    public static synchronized void update(Mare mare, String field, Integer value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = mare.getClass().getDeclaredMethod(field, Integer.class);
        method.setAccessible(true);
        method.invoke(mare, value);
    }

    public static synchronized void update(Mare mare, String field, Specialization value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = mare.getClass().getDeclaredMethod(field, Specialization.class);
        method.setAccessible(true);
        method.invoke(mare, value);
    }

    public static synchronized void update(Mare mare, String field, Ammunition value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = mare.getClass().getDeclaredMethod(field, Ammunition.class);
        method.setAccessible(true);
        method.invoke(mare, value);
    }

    public static synchronized void update(Mare mare, String field, HorseSuit value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = mare.getClass().getDeclaredMethod(field, HorseSuit.class);
        method.setAccessible(true);
        method.invoke(mare, value);
    }

    public static synchronized void update(Mare mare, String field, Pedigree value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = mare.getClass().getDeclaredMethod(field, Pedigree.class);
        method.setAccessible(true);
        method.invoke(mare, value);
    }

    public static synchronized void update(Mare mare, String field, Boolean value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = mare.getClass().getDeclaredMethod(field, Boolean.class);
        method.setAccessible(true);
        method.invoke(mare, value);
    }
}
