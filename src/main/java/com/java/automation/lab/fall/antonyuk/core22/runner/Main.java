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
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.*;
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

    public static void main(String[] args) throws InvalidNameException {
//        DiscountDAO discountDAO = DiscountDAO
//                  .getInstance(new SqlDAO("Discounts"), "Discounts");
        SubscriptionDAO subscriptionDAO = SubscriptionDAO
                .getInstance(new SqlDAO("Subscriptions"), "Subscriptions");
        Discount discount = new Discount("весенние скидки", 10);
        Discount discount2 = new Discount("скидки к Новому году", 25);
        List<Discount> discountList = new ArrayList<>(Arrays.asList(discount, discount2));
        Subscription subscription = new Subscription(new Date(2001),
                 new Date(2001), 6, discountList);
       // Stall stall = new Stall(18, 180, true);
        // StallSubscription stallSubscription = new StallSubscription(stall);
        subscriptionDAO.create(subscription);
        ClassesSubscription classesSubscription = new ClassesSubscription(new Date(2001),
                new Date(2001), 6, discountList, 16);
        SubscriptionDAO classesSubscriptionDAO = SubscriptionDAO
                    .getInstance(new SqlDAO("ClassesSubscriptions"), "ClassesSubscriptions");
            subscriptionDAO.create(classesSubscription);
//          System.out.println(subscriptionDAO.get(1));
//          ContractDAO contractDAO = ContractDAO
//                  .getInstance(new SqlDAO("Contracts"), "Contracts");
//        Contract contract = new Contract("1234", subscription);
//        contractDAO.create(contract);
//        System.out.println(contractDAO.getAll());
    }
}
