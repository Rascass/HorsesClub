package com.java.automation.lab.fall.antonyuk.core22.runner;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.*;
import com.java.automation.lab.fall.antonyuk.core22.dao.daoModel.AddressDAO;
import com.java.automation.lab.fall.antonyuk.core22.dao.daoModel.HorseDAO;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.Address;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Stallion;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Gender;
import com.java.automation.lab.fall.antonyuk.core22.service.UpdateService;

import javax.naming.NamingException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NamingException, SQLException, InterruptedException {
      //  Address address = new Address("Minsk", "Minsk", "Odincova", 1);
//        Stallion stallion = new Stallion();
//        HorseDAO horseDAO = HorseDAO.getInstance(new JSONDAO<Stallion>(), Stallion.class.getName());
//        horseDAO.create(stallion);
        AddressDAO addressDAO = AddressDAO.getInstance(new SqlDAO<Address>("Addresses"),
                "Addresses");
        List<Address> arrayList = addressDAO.getAll();
        for (Address a: arrayList) {
            System.out.println(a);
        }
    }
}

