package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Rider;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class MasterClassService {

    public static synchronized void update(MasterClass masterClass, String field, Date value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = masterClass.getClass().getDeclaredMethod(field, Date.class);
        method.setAccessible(true);
        method.invoke(masterClass, value);
    }
    public static synchronized void update(MasterClass masterClass, String field, HorseClub value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = masterClass.getClass().getDeclaredMethod(field, HorseClub.class);
        method.setAccessible(true);
        method.invoke(masterClass, value);
    }

    public static synchronized void update(MasterClass masterClass, String field, String value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = masterClass.getClass().getDeclaredMethod(field, String.class);
        method.setAccessible(true);
        method.invoke(masterClass, value);
    }

    public static synchronized void update(MasterClass masterClass, String field, Integer value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = masterClass.getClass().getDeclaredMethod(field, Integer.class);
        method.setAccessible(true);
        method.invoke(masterClass, value);
    }

    public static synchronized void update(MasterClass masterClass, String field, Rider value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = masterClass.getClass().getDeclaredMethod(field, Rider.class);
        method.setAccessible(true);
        method.invoke(masterClass, value);
    }
}
