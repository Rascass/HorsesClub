package com.java.automation.lab.fall.antonyuk.core22.domain.cheker;

public final class Validator {

    private Validator() {}

    public static boolean isValidName (String name) {
        String regex = "/w+";
        return name.matches(regex);
    }

    public static boolean isValidNumber (int number) {
        return number >= 0;
    }

    public static boolean isValidFileName(String filePath) {
        String regex = ".+dict";
        return filePath.matches(regex);
    }
}
