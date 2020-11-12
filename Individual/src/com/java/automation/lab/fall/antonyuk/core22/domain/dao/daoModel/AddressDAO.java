package com.java.automation.lab.fall.antonyuk.core22.domain.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.Address;
import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.Dao;

public class AddressDAO extends Dao<Address> {
    private static AddressDAO instance;

    private AddressDAO() {}

    public static synchronized AddressDAO getInstance() {
        if (instance == null) {
            instance = new AddressDAO();
        }
        return instance;
    }

}
