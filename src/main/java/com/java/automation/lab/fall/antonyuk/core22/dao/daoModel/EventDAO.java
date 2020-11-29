package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Event;

public class EventDAO extends Dao<Event> {
    private static EventDAO instance;

    private EventDAO() {}

    public static synchronized EventDAO getInstance() {
        if (instance == null) {
            instance = new EventDAO();
        }
        return instance;
    }

    public static synchronized EventDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new EventDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
