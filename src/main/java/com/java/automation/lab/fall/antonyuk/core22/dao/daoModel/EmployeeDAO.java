package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Person;

public class EmployeeDAO extends Dao<Person> {
    private static EmployeeDAO instance;

    private EmployeeDAO() {}

    public static synchronized EmployeeDAO getInstance() {
        if (instance == null) {
            instance = new EmployeeDAO();
        }
        return instance;
    }

    public static synchronized EmployeeDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new EmployeeDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
