package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.RidingHall;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;

public class RidingHallDAO extends Dao<RidingHall> {
    private static RidingHallDAO instance;

    private RidingHallDAO() {}

    public static synchronized RidingHallDAO getInstance() {
        if (instance == null) {
            instance = new RidingHallDAO();
        }
        return instance;
    }

    public static synchronized RidingHallDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new RidingHallDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
