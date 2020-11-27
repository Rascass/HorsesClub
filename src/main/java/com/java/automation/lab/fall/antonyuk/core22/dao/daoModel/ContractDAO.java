package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.Contract;

public class ContractDAO extends Dao<Contract> {

    public static ContractDAO instance;

    private ContractDAO() {}

    public static synchronized ContractDAO getInstance() {
        if (instance == null) {
            instance = new ContractDAO();
        }
        return instance;
    }

    public static synchronized ContractDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new ContractDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
