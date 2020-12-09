package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import java.util.List;

public class Dao<T> implements Daoable<T>{

    private Daoable<T> dao;
    protected String name;

    @Override
    public T get(int id) {
        return dao.get(id);
    }

    @Override
    public List<T> getAll() {
        return dao.getAll();
    }

    @Override
    public void update(T t) {
        dao.update(t);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public T create(T value) {
        return dao.create(value);
    }

    @Override
    public void setName(String name) {
        this.dao.setName(name);
    }

    public void setDao(Daoable<T> dao, String name) {
        dao.setName(name);
        this.dao = dao;
    }
}
