package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import com.java.automation.lab.fall.antonyuk.core22.constant.Env;
import com.java.automation.lab.fall.antonyuk.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class JSONDAO<T extends AbstractModel> implements Daoable<T> {

    private String name;

    @Override
    public T get(int id) {
        T value = null;
        try {
            value = (T) new JsonIO<>(Class.forName(name))
                    .read(String.format(Env.JSON_OBJ_PATH, Class.forName(name).getCanonicalName()));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public void update(T t) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Integer create(T value) {
        try {
            new JsonIO<>((Class<T>) value.getClass()).write(value, String.format(Env.JSON_OBJ_PATH,
                    value.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
