package com.java.automation.lab.fall.antonyuk.core22.domain;

import com.java.automation.lab.fall.antonyuk.core22.domain.person.*;

import javax.naming.InvalidNameException;

public class Main {
    public static void main(String[] args) {
        Rider rider = (Rider) PersonFactory.createPerson(PersonType.RIDER);
    }
}
