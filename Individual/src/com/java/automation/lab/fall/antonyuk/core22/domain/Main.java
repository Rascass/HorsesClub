package com.java.automation.lab.fall.antonyuk.core22.domain;

import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Mare;

public class Main {
    public static void main(String[] args) {
        Mare mare = new Mare();
        System.out.println(mare.getClass() == new Mare().getClass());
    }
}
