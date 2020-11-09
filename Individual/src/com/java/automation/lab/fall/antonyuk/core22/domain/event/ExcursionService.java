package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Employee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Set;

public class ExcursionService {

    public static synchronized void update(Excursion excursion, String field, Integer value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = excursion.getClass().getDeclaredMethod(field, Integer.class);
        method.setAccessible(true);
        method.invoke(excursion, value);
    }

    public static synchronized void update(Excursion excursion, String field, Double value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = excursion.getClass().getDeclaredMethod(field, Double.class);
        method.setAccessible(true);
        method.invoke(excursion, value);
    }

    public static synchronized void update(Excursion excursion, String field, Employee value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = excursion.getClass().getDeclaredMethod(field, Employee.class);
        method.setAccessible(true);
        method.invoke(excursion, value);
    }

    public static synchronized void update(Excursion excursion, String field, Set<Client> value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = excursion.getClass().getDeclaredMethod(field, Set.class);
        method.setAccessible(true);
        method.invoke(excursion, value);
    }

    public static synchronized void update(Excursion excursion, String field, Date value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = excursion.getClass().getDeclaredMethod(field, Date.class);
        method.setAccessible(true);
        method.invoke(excursion, value);
    }
    public static synchronized void update(Excursion excursion, String field, HorseClub value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = excursion.getClass().getDeclaredMethod(field, HorseClub.class);
        method.setAccessible(true);
        method.invoke(excursion, value);
    }

    public static synchronized void update(Excursion excursion, String field, String value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = excursion.getClass().getDeclaredMethod(field, String.class);
        method.setAccessible(true);
        method.invoke(excursion, value);
    }
}
