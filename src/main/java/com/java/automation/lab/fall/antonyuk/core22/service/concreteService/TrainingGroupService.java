package com.java.automation.lab.fall.antonyuk.core22.service.concreteService;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.TrainingGroup;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Employee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Set;

public class TrainingGroupService {
    public static synchronized <T> void update(TrainingGroup trainingGroup, String field, T value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = trainingGroup.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.invoke(trainingGroup, value);
    }
}
