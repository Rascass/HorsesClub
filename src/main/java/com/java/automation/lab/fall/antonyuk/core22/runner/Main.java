package com.java.automation.lab.fall.antonyuk.core22.runner;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.FileDAO;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.MochaDao;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.SqlDAO;
import com.java.automation.lab.fall.antonyuk.core22.dao.daoModel.AddressDAO;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.Address;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Gender;
import com.java.automation.lab.fall.antonyuk.core22.service.ClientService;

import javax.naming.NamingException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws NamingException, NoSuchMethodException,
            IllegalAccessException, InstantiationException, SQLException, InvocationTargetException,
            IOException, InterruptedException {
        AddressDAO dao = AddressDAO.getInstance(new FileDAO<Address>(), "addresses");
        dao.create(new Address("Minsk", "Minsk", "Odincova", 1));
        AddressDAO dao2 = AddressDAO.getInstance(new MochaDao<Address>(), "addresses");
        dao2.create(new Address("Aa", "Vv", "Cc", 101));
        System.out.println(dao2.get(0).getNumber());
        SqlDAO<Address> sqlDAO = new SqlDAO<>();
        Client client = new Client("FirstName", "SecondName",
                "Lastname", null, Gender.FEMALE,
                null,
                new Date(), false, null);
        ClientService.<Boolean>update(client, "Ban", true);
    }
}

