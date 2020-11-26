package com.java.automation.lab.fall.antonyuk.core22.service;

import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClientService {

    public static synchronized <T> void update(Client client, String field, Class<T> value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = client.getClass().getMethod("set" + field, new Class[] {value.getClass()});
        method.invoke(client, value);
    }
}