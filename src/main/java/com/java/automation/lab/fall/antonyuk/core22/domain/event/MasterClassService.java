package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Rider;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class MasterClassService {

    public static synchronized <T> void update(MasterClass masterClass, String field, Class<T> value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = masterClass.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.invoke(masterClass, value);
    }
}
