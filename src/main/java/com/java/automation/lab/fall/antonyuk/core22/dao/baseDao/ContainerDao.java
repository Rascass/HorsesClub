package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import java.lang.reflect.Method;
import java.util.*;

public abstract class ContainerDao<T extends AbstractModel> implements Daoable<T>{

    private Map<Integer, T> store = new HashMap<>();
    private int counter = 0;

    @Override
    public T get(int id) {
        return store.get(id);
    }

    @Override
    public Map<Integer, T> getAll() {
        return store;
    }

    @Override
    public void update(int id, T t) {
        store.put(id, t);
    }

    @Override
    public void delete(int id) {
        store.remove(id);
    }

    @Override
    public void create(T value) {
        try {
            Method method = value.getClass().getDeclaredMethod("setId", int.class);
            method.setAccessible(true);
            method.invoke(value, counter++);
            store.put(counter, value);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}