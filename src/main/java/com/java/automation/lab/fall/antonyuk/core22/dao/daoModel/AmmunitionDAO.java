package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Ammunition;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;

public class AmmunitionDAO extends Dao<Ammunition> {

    private static AmmunitionDAO instance;

    private AmmunitionDAO() {}

    public static synchronized AmmunitionDAO getInstance() {
        if (instance == null) {
            instance = new AmmunitionDAO();
        }
        return instance;
    }

    public static synchronized AmmunitionDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new AmmunitionDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
