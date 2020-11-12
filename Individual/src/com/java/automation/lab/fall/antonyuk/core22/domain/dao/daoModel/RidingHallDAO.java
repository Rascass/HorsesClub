package com.java.automation.lab.fall.antonyuk.core22.domain.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.domain.building.RidingHall;
import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.Dao;

public class RidingHallDAO extends Dao<RidingHall> {
    private static RidingHallDAO instance;

    private RidingHallDAO() {}

    public static synchronized RidingHallDAO getInstance() {
        if (instance == null) {
            instance = new RidingHallDAO();
        }
        return instance;
    }
}
