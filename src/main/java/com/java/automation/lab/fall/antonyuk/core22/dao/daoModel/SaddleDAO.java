package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Saddle;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;

public class SaddleDAO extends Dao<Saddle> {
    private static SaddleDAO instance;

    private SaddleDAO() {}

    public static synchronized SaddleDAO getInstance() {
        if (instance == null) {
            instance = new SaddleDAO();
        }
        return instance;
    }

    public static synchronized SaddleDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new SaddleDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
