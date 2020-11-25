package com.java.automation.lab.fall.antonyuk.core22.domain.building;

import com.java.automation.lab.fall.antonyuk.core22.domain.event.Competition;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StallService {

    public static synchronized <T> void update(Stall stall, String field, Class<T> value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = stall.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.invoke(stall, value);
    }
}
