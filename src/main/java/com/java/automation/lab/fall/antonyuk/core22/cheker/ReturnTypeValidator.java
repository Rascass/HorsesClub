package com.java.automation.lab.fall.antonyuk.core22.cheker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReturnTypeValidator {
    public static Set<String> returnTypes = new HashSet<>(Arrays
            .asList("java.lang.String", "java.util.Date"));

    private ReturnTypeValidator() {}

    public static boolean isNecessaryQuotes(String type) {
        if (returnTypes.contains(type)) {
            return true;
        }
        String regex = "[A-Z]+";
        if (type.matches(regex)) {
            return true;
        }
        return false;
    }
}
