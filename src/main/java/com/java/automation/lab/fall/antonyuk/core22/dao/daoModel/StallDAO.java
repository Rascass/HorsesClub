package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stall;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;

public class StallDAO extends Dao<Stall> {
    private static StallDAO instance;

    private StallDAO() {}

    public static synchronized StallDAO getInstance() {
        if (instance == null) {
            instance = new StallDAO();
        }
        return instance;
    }

    public static synchronized StallDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new StallDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
