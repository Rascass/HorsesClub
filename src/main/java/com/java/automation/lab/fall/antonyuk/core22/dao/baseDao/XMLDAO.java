package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import com.java.automation.lab.fall.antonyuk.core22.constant.Env;
import com.java.automation.lab.fall.antonyuk.core22.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class XMLDAO<T extends AbstractModel> implements Daoable<T>{

    private String name;

    @Override
    public T get(int id) {
        T value = null;
        try {
            value = (T) new XMLIO<>((Class<T>) Class.forName(name))
                    .read(String.format(Env.XML_OBJ_PATH, name));
        }
        catch (JAXBException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public List<T> getAll() {
       return null;
    }

    @Override
    public void update(Integer id, T t) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void create(T value) {
        try {
            new XMLIO<>((Class<T>) value.getClass())
                    .write(value, String.format(Env.XML_OBJ_PATH,
                            value.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
