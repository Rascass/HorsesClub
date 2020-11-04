package com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.horse.*;

import java.util.Map;

public class HorseFactory {

    private static final Map<TypeHorse, ? extends Horse> types = Map.of(
            TypeHorse.GELDING, new Stallion(true),
            TypeHorse.MARE, new Mare(),
            TypeHorse.STALLION, new Stallion(false)
    );

    private HorseFactory(){}

    public static Horse createHorse(HorseInfo horseInfo, TypeHorse typeHorse) {
        return types.get(typeHorse).setHorseInfo(horseInfo);
    }
}
