package com.java.automation.lab.fall.antonyuk.core22.service;

import com.java.automation.lab.fall.antonyuk.core22.domain.event.MasterClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MasterClassService {

    public static synchronized <T> void update(MasterClass masterClass, String field, Class<T> value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = masterClass.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.invoke(masterClass, value);
    }
}
