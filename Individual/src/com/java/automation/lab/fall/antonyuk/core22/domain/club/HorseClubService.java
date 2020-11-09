package com.java.automation.lab.fall.antonyuk.core22.domain.club;

import com.java.automation.lab.fall.antonyuk.core22.domain.building.RidingHall;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stable;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Mare;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public class HorseClubService {

    public static synchronized void update(HorseClub horseClub, String field, String value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = horseClub.getClass().getDeclaredMethod(field, String.class);
        method.setAccessible(true);
        method.invoke(horseClub, value);
    }

    public static synchronized void update(HorseClub horseClub, String field, Address value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = horseClub.getClass().getDeclaredMethod(field, Address.class);
        method.setAccessible(true);
        method.invoke(horseClub, value);
    }

    public static synchronized void update(HorseClub horseClub, String field, Set value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = horseClub.getClass().getDeclaredMethod(field, Set.class);
        method.setAccessible(true);
        method.invoke(horseClub, value);
    }

    public static synchronized void update(HorseClub horseClub, String field, RidingHall value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = horseClub.getClass().getDeclaredMethod(field, RidingHall.class);
        method.setAccessible(true);
        method.invoke(horseClub, value);
    }

    public static synchronized void update(HorseClub horseClub, String field, Stable value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = horseClub.getClass().getDeclaredMethod(field, Stable.class);
        method.setAccessible(true);
        method.invoke(horseClub, value);
    }
}
