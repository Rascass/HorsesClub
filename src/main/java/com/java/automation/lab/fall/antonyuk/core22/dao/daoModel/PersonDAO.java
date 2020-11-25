package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Person;

public class PersonDAO extends Dao<Person> {
    private static PersonDAO instance;

    private PersonDAO() {}

    public static synchronized PersonDAO getInstance() {
        if (instance == null) {
            instance = new PersonDAO();
        }
        return instance;
    }
}
