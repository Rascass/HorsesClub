package com.java.automation.lab.fall.antonyuk.core22.domain.ammunition;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AmmunitionService {

    public static synchronized void update(Ammunition ammunition, String field, Saddle value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = ammunition.getClass().getDeclaredMethod(field, Saddle.class);
        method.setAccessible(true);
        method.invoke(ammunition, value);
    }

    public static synchronized void update(Ammunition ammunition, String field, Bridle value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = ammunition.getClass().getDeclaredMethod(field, Bridle.class);
        method.setAccessible(true);
        method.invoke(ammunition, value);
    }

    public static synchronized void update(Ammunition ammunition, String field, State value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = ammunition.getClass().getDeclaredMethod(field, State.class);
        method.setAccessible(true);
        method.invoke(ammunition, value);
    }

    public static synchronized void update(Ammunition ammunition, String field, Integer value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = ammunition.getClass().getDeclaredMethod(field, Integer.class);
        method.setAccessible(true);
        method.invoke(ammunition, value);
    }

    public static synchronized void update(Ammunition ammunition, String field, Boolean value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = ammunition.getClass().getDeclaredMethod(field, Boolean.class);
        method.setAccessible(true);
        method.invoke(ammunition, value);
    }
}
