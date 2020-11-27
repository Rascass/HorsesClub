package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.ClientsContracts;

public class ClientsContractsDAO extends Dao<ClientsContracts> {

    public static ClientsContractsDAO instance;

    private ClientsContractsDAO() {}

    public static synchronized ClientsContractsDAO getInstance() {
        if (instance == null) {
            instance = new ClientsContractsDAO();
        }
        return instance;
    }

    public static synchronized ClientsContractsDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new ClientsContractsDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
