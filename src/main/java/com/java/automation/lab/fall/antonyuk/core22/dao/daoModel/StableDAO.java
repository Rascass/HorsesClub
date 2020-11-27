package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stable;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;

public class StableDAO extends Dao<Stable> {

    private static StableDAO instance;

    private StableDAO() {}

    public static synchronized StableDAO getInstance() {
        if (instance == null) {
            instance = new StableDAO();
        }
        return instance;
    }

    public static synchronized StableDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new StableDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
