package com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.*;

public class HobbyHorseFactory {

    private HobbyHorseFactory(){}

    public static Horse createHorse(HorseInfo horseInfo, HorseGender horseGender, HorseSuit horseSuit) {
        return HorseFactory.createHorse(horseGender, horseInfo, horseSuit)
                .setSpecialization(Specialization.HOBBY);
    }
}
