package com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.HorseInfo;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.HorseSuit;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.HorseGender;

public class SportHorseFactory {

    public static Horse createHorse(HorseInfo horseInfo, HorseGender horseGender,
                                    HorseSuit horseSuit, Specialization specialization) {
        return HorseFactory.createHorse(horseGender, horseInfo, horseSuit)
                .setSpecialization(specialization);
    }
}
