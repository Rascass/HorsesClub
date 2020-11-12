package com.java.automation.lab.fall.antonyuk.core22.domain.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.Dao;
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
}
