package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;

public class HorseDAO extends Dao<Horse> {

    private static HorseDAO instance;

    private HorseDAO() {}

    public static synchronized HorseDAO getInstance() {
        if (instance == null) {
            instance = new HorseDAO();
        }
        return instance;
    }

    public static synchronized HorseDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new HorseDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
