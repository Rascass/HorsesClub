package com.java.automation.lab.fall.antonyuk.core22.dao.daoModel;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Dao;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.Daoable;
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.Discount;

public class DiscountDAO extends Dao<Discount> {

    public static DiscountDAO instance;

    private DiscountDAO() {}

    public static synchronized DiscountDAO getInstance() {
        if (instance == null) {
            instance = new DiscountDAO();
        }
        return instance;
    }

    public static synchronized DiscountDAO getInstance(Daoable dao, String name) {
        if (instance == null) {
            instance = new DiscountDAO();
        }
        instance.setDao(dao, name);
        return instance;
    }
}
