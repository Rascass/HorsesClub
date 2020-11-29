package com.java.automation.lab.fall.antonyuk.core22.runner;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.*;
import com.java.automation.lab.fall.antonyuk.core22.dao.daoModel.AddressDAO;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.Address;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Stallion;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Gender;
import com.java.automation.lab.fall.antonyuk.core22.service.UpdateService;

import javax.naming.NamingException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws NamingException, NoSuchMethodException,
            IllegalAccessException, InstantiationException, SQLException, InvocationTargetException,
            IOException, InterruptedException {
        AddressDAO addressDAO = AddressDAO.getInstance( new SqlDAO<Address>("Addresses"), "Addresses");
        Address address = new Address("Minsk", "Minsk", "Odincova", 1);
//        Horse horse = new Stallion();
       // addressDAO.create(address);
        System.out.println(addressDAO.get(0));
    }
}

