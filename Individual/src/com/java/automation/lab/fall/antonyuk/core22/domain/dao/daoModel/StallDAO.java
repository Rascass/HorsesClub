package com.java.automation.lab.fall.antonyuk.core22.domain.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stall;
import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.Dao;

public class StallDAO extends Dao<Stall> {
    private static StallDAO instance;

    private StallDAO() {}

    public static synchronized StallDAO getInstance() {
        if (instance == null) {
            instance = new StallDAO();
        }
        return instance;
    }
}
