package com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.HorseInfo;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.HorseSuit;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Gender;

public class SportHorseFactory {

    public static Horse createHorse(HorseInfo horseInfo, Gender gender,
                                    HorseSuit horseSuit, Specialization specialization) {
        return HorseFactory.createHorse(gender)
                .setHorseSuit(horseSuit)
                .setHorseInfo(horseInfo)
                .setSpecialization(specialization);
    }
}
