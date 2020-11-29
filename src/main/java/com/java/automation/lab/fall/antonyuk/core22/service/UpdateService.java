package com.java.automation.lab.fall.antonyuk.core22.service;

import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UpdateService {
    public static synchronized <T, E> void update(E clasz, String field, T value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = clasz.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.setAccessible(true);
        method.invoke(clasz, value);
    }
}
