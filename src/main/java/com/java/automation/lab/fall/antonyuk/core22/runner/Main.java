package com.java.automation.lab.fall.antonyuk.core22.runner;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.*;
import com.java.automation.lab.fall.antonyuk.core22.dao.daoModel.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.RidingHall;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stable;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stall;
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
import java.util.*;

public class Main {
    public static void main(String[] args) throws NamingException, SQLException,
            InterruptedException, EmptyTypeException, NotSpecifiedSizeException {
//        Saddle saddle = new Saddle(12.5, SaddleType.DRESSAGE);
//        Bridle bridle = new Bridle(BridleSize.FULL, BridleType.SPANISH);
//        Ammunition ammunition = new Ammunition(bridle, saddle);
//        AmmunitionDAO ammunitionDAO = AmmunitionDAO.getInstance(new SqlDAO<Address>("Ammunitions"),
//                "Ammunitions");
//        ammunitionDAO.update(1, ammunition);
//        List<Ammunition> arrayList = ammunitionDAO.getAll();
//        for (Ammunition a: arrayList) {
//            System.out.println(a.getState());
//        }
//        RidingHall ridingHall = new RidingHall(120, 100, 30);
//        RidingHallDAO ridingHallDAO = RidingHallDAO.getInstance(
//                new SqlDAO<RidingHall>("RidingHalls"), "RidingHalls");
//        ridingHallDAO.create(ridingHall);
//        System.out.println(ridingHallDAO.get(1));
        Stall stall = new Stall(20, 300, true);
        StallDAO stallDAO = StallDAO.getInstance(new SqlDAO("Stalls"), "Stalls");
//        stallDAO.create(stall);
//        System.out.println(stallDAO.get(1));
        Stable stable = new Stable(200, new HashSet<>(Arrays.asList(stall)));
        StableDAO stableDAO = StableDAO.getInstance(new SqlDAO("Stables"), "Stables");
        stableDAO.create(stable);
        System.out.println(stableDAO.get(1));
    }
}

