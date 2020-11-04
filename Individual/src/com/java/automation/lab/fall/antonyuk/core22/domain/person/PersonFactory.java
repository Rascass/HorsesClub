package com.java.automation.lab.fall.antonyuk.core22.domain.person;
import com.java.automation.lab.fall.antonyuk.core22.domain.Factory;

import java.util.Map;

public class PersonFactory {

    private static final Map<PersonType, Class> types = Map.of(
            PersonType.CLIENT, Client.class,
            PersonType.EMPLOYEE, Employee.class,
            PersonType.RIDER, Rider.class
    );

    private PersonFactory() {}

    public static Person createPerson(PersonType personType) {
        return (Person) Factory.getFactory(types.get(personType))
                .getInstance();
    }
}