package com.java.automation.lab.fall.antonyuk.core22.runner;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.*;
import com.java.automation.lab.fall.antonyuk.core22.dao.daoModel.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.RidingHall;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stable;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stall;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.Address;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Mare;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Pedigree;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Stallion;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.ClassesSubscription;
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.Contract;
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.StallSubscription;
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.Subscription;
import com.java.automation.lab.fall.antonyuk.core22.exception.EmptyTypeException;
import com.java.automation.lab.fall.antonyuk.core22.exception.NotSpecifiedSizeException;
import com.java.automation.lab.fall.antonyuk.core22.service.UpdateService;

import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.profiler.Profiler;
import org.slf4j.profiler.TimeInstrument;

public class Main {

    public static void main(String[] args) throws EmptyTypeException, NotSpecifiedSizeException {
//        Saddle saddle = new Saddle(12.5, SaddleType.DRESSAGE);
//        Bridle bridle = new Bridle(BridleSize.FULL, BridleType.SPANISH);
//        Ammunition ammunition = new Ammunition(bridle, saddle);
//        AmmunitionDAO ammunitionDAO = AmmunitionDAO.getInstance(new SqlDAO<Address>("Ammunitions"),
//                "Ammunitions");
//        ammunitionDAO.update(1, ammunition);
//        List<Ammunition> arrayList = ammunitionDAO.getAll();
//        for (Ammunition a: arrayList) {
//            System.out.println(a);
        //  }

        //        RidingHall ridingHall = new RidingHall(120, 100, 30);
//        RidingHallDAO ridingHallDAO = RidingHallDAO.getInstance(
//                new SqlDAO<RidingHall>("RidingHalls"), "RidingHalls");
//        ridingHallDAO.create(ridingHall);
//        System.out.println(ridingHallDAO.get(1));
        //  Stall stall = new Stall(20, 300, true);
        // StallDAO stallDAO = StallDAO.getInstance(new SqlDAO("Stalls"), "Stalls");
//        stallDAO.create(stall);
//        System.out.println(stallDAO.get(1));
//        Stable stable = new Stable(200, new HashSet<>(Arrays.asList(stall)));
//        StableDAO stableDAO = StableDAO.getInstance(new SqlDAO("Stables"), "Stables");
//        stableDAO.create(stable);
//        System.out.println(stableDAO.get(1));
        //  Subscription subscription = new Subscription();
        //SubscriptionDAO subscriptionDAO = SubscriptionDAO
        //    .getInstance(new SqlDAO("Subscriptions"), "Subscriptions");
        //    subscriptionDAO.create(subscription);
        //  System.out.println(subscriptionDAO.get(1));
        // StallSubscription stallSubscription = new StallSubscription(stall);
//        ClassesSubscription classesSubscription = new ClassesSubscription(16);
//        SubscriptionDAO subscriptionDAO = SubscriptionDAO
//                    .getInstance(new SqlDAO("ClassesSubscriptions"), "ClassesSubscriptions");
//            subscriptionDAO.create(classesSubscription);
//          System.out.println(subscriptionDAO.get(1));
//          ContractDAO contractDAO = ContractDAO
//                  .getInstance(new SqlDAO("Contracts"), "Contracts");
//        Contract contract = new Contract("1234", subscription);
//        contractDAO.create(contract);
//        System.out.println(contractDAO.getAll());
//        Rider rider = new Rider("name", "secondname",
//                "lastname", null,
//                Gender.FEMALE, Category.CANDIDATE);
//        PersonDAO personDAO = PersonDAO.getInstance(new SqlDAO<Rider>("Riders"), "Riders");
//        personDAO.create(rider);
//        System.out.println(personDAO.getAll());
//        Client client = new Client("name", "secondname", "lastname", null,
//                Gender.FEMALE, null, null, false, null);
//        PersonDAO personDAO = PersonDAO.getInstance(new SqlDAO<Client>("Clients"), "Clients");
//        personDAO.create(client);
//        System.out.println(personDAO.get(1));
//        Stallion stallion = new Stallion(true);
//        HorseDAO horseDAO = HorseDAO.getInstance(new SqlDAO<Stallion>("StallionHorses"), "StallionHorses");
//        horseDAO.create(stallion);
//        stallion.setId(1);
        //System.out.println(horseDAO.get(1));
       // Veterinar veterinar = new Veterinar("Terapevt");
       // PersonDAO personDAO = PersonDAO.getInstance(new SqlDAO<Veterinar>("Veterinars"), "Veterinars");
       // logger.info("Veterinar" +  veterinar.getProfSpecialization());
      //  personDAO.create(veterinar);
//        AmmunitionDAO ammunitionDAO = AmmunitionDAO.getInstance(new SqlDAO("Ammunitions"), "Ammunitions");
//        Saddle saddle = new Saddle(12.5, SaddleType.DRESSAGE);
//       Bridle bridle = new Bridle(BridleSize.FULL, BridleType.SPANISH);
//        BridleDAO bridleDAO = BridleDAO.getInstance(new SqlDAO<Bridle>("Bridles"), "Bridles");
//        SaddleDAO saddleDAO = SaddleDAO.getInstance(new SqlDAO<Bridle>("Saddles"), "Saddles");
//        bridleDAO.create(bridle);
//        saddleDAO.create(saddle);
//        System.out.println(bridle.getId());
//        System.out.println(saddle.getId());
    //    RidingHall ridingHall = new RidingHall(120, 100, 30);
     //   RidingHallDAO ridingHallDAO = RidingHallDAO.getInstance(
     //           new SqlDAO<RidingHall>("RidingHalls"), "RidingHalls");
     //   ridingHallDAO.create(ridingHall);
//        System.out.println(ridingHallDAO.get(1));
        Stall stall = new Stall(20, 300, true);
        Stall stall1 = new Stall(16, 250, true);
        Stall stall2 = new Stall(18, 220, false);
        StableDAO stableDAO = StableDAO.getInstance(new SqlDAO("Stables"), "Stables");
        Stable stable = new Stable(200, new HashSet<>(Arrays.asList(stall1, stall2, stall)));
        //stableDAO.create(stable);
        StallDAO stallDAO = StallDAO.getInstance(new SqlDAO("Stalls"), "Stalls");
        //stallDAO.create(stall);
        //stallDAO.create(stall1);
        //stallDAO.create(stall2);
        var array = stableDAO.getAll();
        for (Stable s: array) {
            System.out.println(s);
        }
    }
}

