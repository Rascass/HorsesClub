package com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.Factory;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.*;

import java.util.Map;

public class HorseFactory {

    private static final Map<Gender, Class> types = Map.of(
            Gender.MARE, Mare.class,
            Gender.STALLION, Stallion.class
    );

    private HorseFactory(){}

    public static Horse createHorse(Gender gender) {
        return (Horse) Factory.getFactory(types.get(gender))
                .getInstance();
    }
}
