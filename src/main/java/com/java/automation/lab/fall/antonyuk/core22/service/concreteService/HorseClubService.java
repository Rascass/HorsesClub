package com.java.automation.lab.fall.antonyuk.core22.service.concreteService;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HorseClubService {

    public static synchronized <T> void update(HorseClub horseClub, String field, T value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = horseClub.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.invoke(horseClub, value);
    }

}
