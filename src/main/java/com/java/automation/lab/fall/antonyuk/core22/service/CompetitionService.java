package com.java.automation.lab.fall.antonyuk.core22.service;

import com.java.automation.lab.fall.antonyuk.core22.domain.event.Competition;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Mare;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CompetitionService {

    public static synchronized <T> void update(Competition competition, String field, Class<T> value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = competition.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.invoke(competition, value);
    }
}
