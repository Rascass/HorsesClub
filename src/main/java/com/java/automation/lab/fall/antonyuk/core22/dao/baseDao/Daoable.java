package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import java.util.List;

public interface Daoable<T extends AbstractModel> {

     T get(int id);
     List<T> getAll();
     void update( T t);
     void delete(int id);
     T create(T value);
     void setName(String name);
}
