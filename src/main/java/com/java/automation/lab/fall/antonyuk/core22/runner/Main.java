package com.java.automation.lab.fall.antonyuk.core22.runner;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.*;
import com.java.automation.lab.fall.antonyuk.core22.dao.daoModel.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.Address;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Stallion;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Gender;
import com.java.automation.lab.fall.antonyuk.core22.exception.EmptyTypeException;
import com.java.automation.lab.fall.antonyuk.core22.exception.NotSpecifiedSizeException;
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
    public static void main(String[] args) throws NamingException, SQLException, InterruptedException, EmptyTypeException, NotSpecifiedSizeException {
//        Address address = new Address("Minsk", "Minsk", "Lukyanova", 123);
//        AddressDAO addressDAO = AddressDAO.getInstance(new SqlDAO<Address>("Addresses"),
//                "Addresses");
//        addressDAO.update(7, address);
//        System.out.println(addressDAO.get(7));
        Saddle saddle = new Saddle(12.5, SaddleType.DRESSAGE);
        Bridle bridle = new Bridle(BridleSize.FULL, BridleType.SPANISH);
//        SaddleDAO saddleDAO = SaddleDAO.getInstance(new SqlDAO<Saddle>("Saddles"),
//                "Saddles");
//        saddleDAO.create(saddle);
//        saddleDAO.update(1, saddle);
//        System.out.println(saddleDAO.get(1));
        Ammunition ammunition = new Ammunition(bridle, saddle);
        AmmunitionDAO ammunitionDAO = AmmunitionDAO.getInstance(new SqlDAO<Address>("Ammunitions"),
                "Ammunitions");
        ammunitionDAO.update(1, ammunition);
        List<Ammunition> arrayList = ammunitionDAO.getAll();
        for (Ammunition a: arrayList) {
            System.out.println(a);
        }
    }
}

