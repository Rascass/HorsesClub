package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import java.util.*;

public class MochaDAO<T extends AbstractModel> implements Daoable<T>{

    private List<T> store = new ArrayList<>();
    private int counter = 0;
    private String name;

    @Override
    public T get(int id) {
        return store.get(id);
    }

    @Override
    public List<T> getAll() {
        return store;
    }

    @Override
    public void update(T t) {
        store.add(t);
    }

    @Override
    public void delete(int id) {
        store.remove(id);
    }

    @Override
    public Integer create(T value) {
       value.setId(counter);
       store.set(counter++, value);
       return counter;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}