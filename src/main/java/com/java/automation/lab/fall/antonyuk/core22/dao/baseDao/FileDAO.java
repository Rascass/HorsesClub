package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import com.java.automation.lab.fall.antonyuk.core22.constant.Env;
import com.java.automation.lab.fall.antonyuk.core22.io.ObjectIO;

import java.util.Map;

public class FileDAO <T extends AbstractModel> implements Daoable<T>{

    private String name;
    private static int counterId = 0;

    @Override
    public T get(int id) {
        return new ObjectIO<T>().read(Env.path.resolve(name + ".csv").toString());
    }

    @Override
    public Map<Integer, T> getAll() {
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
        value.setId(counterId++);
        new ObjectIO<T>().write(value, Env.path.resolve(name + ".csv").toString());
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
