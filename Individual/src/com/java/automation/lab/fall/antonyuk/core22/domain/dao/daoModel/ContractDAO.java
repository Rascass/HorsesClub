package com.java.automation.lab.fall.antonyuk.core22.domain.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.Dao;
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
}
