package com.java.automation.lab.fall.antonyuk.core22.domain;

import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.constant.Env;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.EmptyTypeException;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.IncorrectNameFileException;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.NotSpecifiedSizeException;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.HorseInfo;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.HorseSuit;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Pedigree;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.TypeHorse;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory.HobbyHorseFactory;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Gender;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.PersonFactory.PersonFactory;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.PersonInfo;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.PersonType;

import javax.naming.InvalidNameException;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws InvalidNameException, IOException, NotSpecifiedSizeException, IncorrectNameFileException, EmptyTypeException {
        Saddle saddle1 = new Saddle(12.5, SaddleType.DRESSAGE, 1);
        Saddle saddle2 = new Saddle(13.5, SaddleType.JUMPING, 2);
        Bridle bridle1 = new Bridle(BridleSize.FULL, BridleType.UNIVERSAL, 1);
        Bridle bridle2 = new Bridle(BridleSize.FULL, BridleType.UNIVERSAL, 1);
        Ammunition ammunition = new Ammunition(bridle1, saddle1);
        Ammunition ammunition1 = new Ammunition(bridle2, saddle2);
        Util.append(Env.SADDLE_PATH, saddle1.toString());
        Util.append(Env.BRIDLE_PATH, bridle1.toString());
        Util.append(Env.AMMUNITION_PATH, ammunition.toString());
        Util.append(Env.AMMUNITION_PATH, ammunition1.toString());
        PersonInfo personInfo = new PersonInfo("Jack", "SecondName", "LastName",
                new Date(), Gender.FEMALE);
        Util.append(Env.CLIENT_PATH, PersonFactory.createPerson(PersonType.CLIENT, personInfo).toString());
        HorseInfo horseInfo = new HorseInfo("Leo", new Date(), Specialization.HOBBY, new Pedigree(),
                ammunition, HorseSuit.BROWN);
        Util.append(Env.HORSE_PATH, HobbyHorseFactory.createHorse(horseInfo,
                TypeHorse.MARE, horseInfo.getHorseSuit()).toString());
        Util.append(Env.EMPLOYEE_PATH, PersonFactory.createPerson(PersonType.EMPLOYEE, personInfo).toString());
        HorseClub horseClub = new HorseClub();
    }
}
