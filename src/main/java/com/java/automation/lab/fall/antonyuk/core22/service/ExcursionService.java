package com.java.automation.lab.fall.antonyuk.core22.service;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Excursion;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Employee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Set;

public class ExcursionService {

    public static synchronized <T> void update(Excursion excursion, String field, Class<T> value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = excursion.getClass().getMethod("set" + field, new Class[]{value.getClass()});
        method.invoke(excursion, value);
    }
}