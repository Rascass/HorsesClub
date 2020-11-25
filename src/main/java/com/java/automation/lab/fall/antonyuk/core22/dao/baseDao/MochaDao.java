package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import java.lang.reflect.Method;
import java.util.*;

public class MochaDao<T extends AbstractModel> implements Daoable<T>{

    private Map<Integer, T> store = new HashMap<>();
    private int counter = 0;
    private String name;

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
       value.setId(counter);
       store.put(counter++, value);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}