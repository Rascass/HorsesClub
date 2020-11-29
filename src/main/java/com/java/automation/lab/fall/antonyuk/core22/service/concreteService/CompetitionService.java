package com.java.automation.lab.fall.antonyuk.core22.service.concreteService;

import com.java.automation.lab.fall.antonyuk.core22.domain.event.Competition;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CompetitionService {

    public static synchronized <T> void update(Competition competition, String field, T value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = competition.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.invoke(competition, value);
    }
}
