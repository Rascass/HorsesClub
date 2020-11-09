package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Mare;
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.ClientsContracts;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Set;

public class ClientService {

    public static synchronized void update(Client client, String field, Set<Horse> value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = client.getClass().getDeclaredMethod(field, Set.class);
        method.setAccessible(true);
        method.invoke(client, value);
    }

    public static synchronized void update(Client client, String field, ClientsContracts value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = client.getClass().getDeclaredMethod(field, ClientsContracts.class);
        method.setAccessible(true);
        method.invoke(client, value);
    }

    public static synchronized void update(Client client, String field, Boolean value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = client.getClass().getDeclaredMethod(field, Boolean.class);
        method.setAccessible(true);
        method.invoke(client, value);
    }
    public static synchronized void update(Client client, String field, String value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = client.getClass().getDeclaredMethod(field, String.class);
        method.setAccessible(true);
        method.invoke(client, value);
    }
    public static synchronized void update(Client client, String field, Date value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = client.getClass().getDeclaredMethod(field, Date.class);
        method.setAccessible(true);
        method.invoke(client, value);
    }

    public static synchronized void update(Client client, String field, Gender value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Method method = client.getClass().getDeclaredMethod(field, Gender.class);
        method.setAccessible(true);
        method.invoke(client, value);
    }
}