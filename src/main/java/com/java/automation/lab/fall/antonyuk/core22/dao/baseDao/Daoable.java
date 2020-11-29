package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import java.util.Map;

public interface Daoable<T> {

     T get(int id);

     Map<Integer, T> getAll();

     void update(int id, T t);

     void delete(int id);

     void create(T value);

     void setName(String name);
}
