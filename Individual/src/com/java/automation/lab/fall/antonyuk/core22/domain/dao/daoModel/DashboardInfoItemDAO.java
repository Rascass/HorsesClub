package com.java.automation.lab.fall.antonyuk.core22.domain.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.Dao;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.dashboard.DashboardInfoItem;

public class DashboardInfoItemDAO extends Dao<DashboardInfoItem> {

    public static DashboardInfoItemDAO instance;

    private DashboardInfoItemDAO() {}

    public static synchronized DashboardInfoItemDAO getInstance() {
        if (instance == null) {
            instance = new DashboardInfoItemDAO();
        }
        return instance;
    }
}
