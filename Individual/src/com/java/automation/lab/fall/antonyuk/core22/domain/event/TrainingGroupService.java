package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Employee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Set;

public class TrainingGroupService {

    public static synchronized void update(TrainingGroup trainingGroup, String field, String value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = trainingGroup.getClass().getDeclaredMethod(field, String.class);
        method.setAccessible(true);
        method.invoke(trainingGroup, value);
    }

    public static synchronized void update(TrainingGroup trainingGroup, String field, Employee value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = trainingGroup.getClass().getDeclaredMethod(field, Employee.class);
        method.setAccessible(true);
        method.invoke(trainingGroup, value);
    }

    public static synchronized void update(TrainingGroup trainingGroup, String field, Set<Client> value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = trainingGroup.getClass().getDeclaredMethod(field, Set.class);
        method.setAccessible(true);
        method.invoke(trainingGroup, value);
    }

    public static synchronized void update(TrainingGroup trainingGroup, String field, HorseClub value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = trainingGroup.getClass().getDeclaredMethod(field, HorseClub.class);
        method.setAccessible(true);
        method.invoke(trainingGroup, value);
    }

    public static synchronized void update(TrainingGroup trainingGroup, String field, Date value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = trainingGroup.getClass().getDeclaredMethod(field, Date.class);
        method.setAccessible(true);
        method.invoke(trainingGroup, value);
    }
}
