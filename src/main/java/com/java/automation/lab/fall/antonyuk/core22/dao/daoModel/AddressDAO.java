package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.Address;

public class AddressDAO extends Dao<Address> {

    private static AddressDAO instance;
    private AddressDAO() {}
    public static synchronized AddressDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new AddressDAO();
        }
        System.out.println(name);
        instance.setDao(dao, name);
        return instance;
    }

    public static synchronized AddressDAO getInstance() {
        if (instance == null) {
            instance = new AddressDAO();
        }
        return instance;
    }
}
