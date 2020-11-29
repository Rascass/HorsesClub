package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.Subscription;

public class SubscriptionDAO extends Dao<Subscription> {
    private static SubscriptionDAO instance;

    private SubscriptionDAO() {}

    public static synchronized SubscriptionDAO getInstance() {
        if (instance == null) {
            instance = new SubscriptionDAO();
        }
        return instance;
    }

    public static synchronized SubscriptionDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new SubscriptionDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
