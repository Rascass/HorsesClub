package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import java.util.Map;

public class SqlDAO<T extends AbstractModel> implements Daoable<T>{

    private String tableName;

    @Override
    public T get(int id) {
        String pattern = "select * from $(tableName) where id = $(id)";
        //database connection
        return null;
    }

    @Override
    public Map<Integer, T> getAll() {
        String pattern = "select * from $(tableName)";
        //database connection
        return null;
    }

    @Override
    public void update(int id, T t) {
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public void create(T value) {
    }

    @Override
    public void setName(String name) {
        tableName = name;
    }
}
