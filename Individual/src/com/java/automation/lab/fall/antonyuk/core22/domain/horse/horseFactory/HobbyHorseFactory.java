package com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.*;

public class HobbyHorseFactory {

    private HobbyHorseFactory(){}

    public static Horse createHorse(HorseInfo horseInfo, Gender gender, HorseSuit horseSuit) {
        return HorseFactory.createHorse(gender)
                .setHorseInfo(horseInfo)
                .setSpecialization(Specialization.HOBBY)
                .setHorseSuit(horseSuit);
    }
}
