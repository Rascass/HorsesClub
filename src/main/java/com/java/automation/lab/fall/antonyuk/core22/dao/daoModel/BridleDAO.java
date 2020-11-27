package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Bridle;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;

public class BridleDAO extends Dao<Bridle> {

    public static BridleDAO instance;

    private BridleDAO() {}

    public static synchronized BridleDAO getInstance() {
        if (instance == null) {
            instance = new BridleDAO();
        }
        return instance;
    }

    public static synchronized BridleDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new BridleDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
