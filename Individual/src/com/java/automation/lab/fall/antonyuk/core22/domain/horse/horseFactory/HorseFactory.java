package com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.Factory;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.*;

import java.util.Map;

public class HorseFactory {

    private static final Map<HorseGender, Factory<? extends Horse>> types = Map.of(
            HorseGender.MARE, new Factory<>(Mare.class),
            HorseGender.STALLION, new Factory<>(Stallion.class)
    );

    private HorseFactory(){}

    public static Horse createHorse(HorseGender horseGender, HorseInfo horseInfo, HorseSuit horseSuit) {
        return types.get(horseGender)
                .getInstance()
                .setHorseInfo(horseInfo
                .setHorseSuit(horseSuit));
    }
}
