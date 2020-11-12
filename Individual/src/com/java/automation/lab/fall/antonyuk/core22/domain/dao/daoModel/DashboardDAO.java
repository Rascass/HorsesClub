package com.java.automation.lab.fall.antonyuk.core22.domain.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.Dao;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.dashboard.Dashboard;

public class DashboardDAO extends Dao<Dashboard> {

    public static DashboardDAO instance;

    private DashboardDAO() {}

    public static synchronized DashboardDAO getInstance() {
        if (instance == null) {
            instance = new DashboardDAO();
        }
        return instance;
    }
}
