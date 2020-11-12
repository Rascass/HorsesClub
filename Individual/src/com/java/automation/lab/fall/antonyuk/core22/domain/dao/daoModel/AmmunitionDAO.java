package com.java.automation.lab.fall.antonyuk.core22.domain.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Ammunition;
import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.Dao;

public class AmmunitionDAO extends Dao<Ammunition> {

    private static AmmunitionDAO instance;

    private AmmunitionDAO() {}

    public static synchronized AmmunitionDAO getInstance() {
        if (instance == null) {
            instance = new AmmunitionDAO();
        }
        return instance;
    }
}
