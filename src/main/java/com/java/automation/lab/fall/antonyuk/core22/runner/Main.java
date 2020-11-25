package com.java.automation.lab.fall.antonyuk.core22.runner;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.FileDAO;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.MochaDao;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.SqlDAO;
import com.java.automation.lab.fall.antonyuk.core22.dao.daoModel.AddressDAO;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.Address;

import javax.naming.InvalidNameException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws InvalidNameException, NoSuchMethodException,
            IllegalAccessException, InstantiationException, SQLException, InvocationTargetException, ClassNotFoundException {
        AddressDAO dao = AddressDAO.getInstance(new FileDAO<Address>(), "addresses");
        dao.create(new Address("Minsk", "Minsk", "Odincova", 1));
        AddressDAO dao2 = AddressDAO.getInstance(new MochaDao<Address>(), "addresses");
        dao2.create(new Address("Aa", "Vv", "Cc", 101));
        System.out.println(dao2.get(0).getNumber());
        SqlDAO<Address> sqlDAO = new SqlDAO<Address>();
        sqlDAO.connect();

    }
}
