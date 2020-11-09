package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.concurrent.ExecutorCompletionService;

public class CompetitionService {

    public static synchronized void update(Competition competition, String field, Integer value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = competition.getClass().getDeclaredMethod(field, Integer.class);
        method.setAccessible(true);
        method.invoke(competition, value);
    }
    public static synchronized void update(Competition competition, String field, Unit value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = competition.getClass().getDeclaredMethod(field, Unit.class);
        method.setAccessible(true);
        method.invoke(competition, value);
    }

    public static synchronized void update(Competition competition, String field, Date value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = competition.getClass().getDeclaredMethod(field, Date.class);
        method.setAccessible(true);
        method.invoke(competition, value);
    }

    public static synchronized void update(Competition competition, String field, HorseClub value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = competition.getClass().getDeclaredMethod(field, HorseClub.class);
        method.setAccessible(true);
        method.invoke(competition, value);
    }

    public static synchronized void update(Competition competition, String field, String value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = competition.getClass().getDeclaredMethod(field, String.class);
        method.setAccessible(true);
        method.invoke(competition, value);
    }
}
