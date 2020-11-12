package com.java.automation.lab.fall.antonyuk.core22.domain.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stable;
import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.Dao;

public class StableDAO extends Dao<Stable> {

    private static StableDAO instance;

    private StableDAO() {}

    public static synchronized StableDAO getInstance() {
        if (instance == null) {
            instance = new StableDAO();
        }
        return instance;
    }
}
