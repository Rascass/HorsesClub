package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RiderService {

    public static synchronized <T> void update(Rider rider, String field, Class<T> value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = rider.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.invoke(rider, value);
    }
}
