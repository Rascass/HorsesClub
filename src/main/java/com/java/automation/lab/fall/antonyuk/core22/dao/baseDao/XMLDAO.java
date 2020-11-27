package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import com.java.automation.lab.fall.antonyuk.core22.constant.Env;
import com.java.automation.lab.fall.antonyuk.core22.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.Map;

public class XMLDAO<T extends AbstractModel> implements Daoable<T>{

    private String name;

    @Override
    public T get(int id) {
        return null;
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
        try {
            new XMLIO<T>((Class<T>) value.getClass()).write(value, String.format(Env.XML_OBJ_PATH, value.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
