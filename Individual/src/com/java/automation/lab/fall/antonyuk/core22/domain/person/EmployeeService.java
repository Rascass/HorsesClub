package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class EmployeeService {

    public static synchronized void update(Employee employee, String field, String value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = employee.getClass().getDeclaredMethod(field, String.class);
        method.setAccessible(true);
        method.invoke(employee, value);
    }

    public static synchronized void update(Employee employee, String field, Gender value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = employee.getClass().getDeclaredMethod(field, Gender.class);
        method.setAccessible(true);
        method.invoke(employee, value);
    }

    public static synchronized void update(Employee employee, String field, Date value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = employee.getClass().getDeclaredMethod(field, Date.class);
        method.setAccessible(true);
        method.invoke(employee, value);
    }

    public static synchronized void update(Employee employee, String field, Position value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = employee.getClass().getDeclaredMethod(field, Position.class);
        method.setAccessible(true);
        method.invoke(employee, value);
    }

    public static synchronized void update(Employee employee, String field, Double value)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = employee.getClass().getDeclaredMethod(field, Double.class);
        method.setAccessible(true);
        method.invoke(employee, value);
    }
}
