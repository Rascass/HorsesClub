package com.java.automation.lab.fall.antonyuk.core22.service.concreteService;

import com.java.automation.lab.fall.antonyuk.core22.domain.building.RidingHall;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RidingHallService {

    public static synchronized void update(RidingHall ridingHall, String field, Integer value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = ridingHall.getClass().getDeclaredMethod(field, Integer.class);
        method.setAccessible(true);
        method.invoke(method, value);
    }
}
