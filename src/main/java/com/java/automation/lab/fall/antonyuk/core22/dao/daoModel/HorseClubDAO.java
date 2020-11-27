package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;

public class HorseClubDAO extends Dao<HorseClub> {
    private static HorseClubDAO instance;

    private HorseClubDAO() {}

    public static synchronized HorseClubDAO getInstance() {
        if (instance == null) {
            instance = new HorseClubDAO();
        }
        return instance;
    }

    public static synchronized HorseClubDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new HorseClubDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
