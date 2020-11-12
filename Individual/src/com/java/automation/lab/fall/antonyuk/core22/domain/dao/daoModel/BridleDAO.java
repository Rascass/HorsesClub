package com.java.automation.lab.fall.antonyuk.core22.domain.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Bridle;
import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.Dao;

public class BridleDAO extends Dao<Bridle> {

    public static BridleDAO instance;

    private BridleDAO() {}

    public static synchronized BridleDAO getInstance() {
        if (instance == null) {
            instance = new BridleDAO();
        }
        return instance;
    }
}
