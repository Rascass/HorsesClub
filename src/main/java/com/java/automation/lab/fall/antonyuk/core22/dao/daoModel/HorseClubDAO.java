package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

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
}
