package com.java.automation.lab.fall.antonyuk.core22.domain.person;
import com.java.automation.lab.fall.antonyuk.core22.domain.Factory;

import java.util.Map;

public class PersonFactory {

    private static final Map<PersonType, Factory<? extends Person>> types = Map.of(
            PersonType.CLIENT, new Factory<>(Client.class),
            PersonType.EMPLOYEE, new Factory<>(Employee.class),
            PersonType.RIDER, new Factory<>(Rider.class)
    );

    private PersonFactory() {}

    public static Person createPerson(PersonType personType, PersonInfo personInfo) {
        return types.get(personType)
                .getInstance()
                .setPersonInfo(personInfo);
    }
}