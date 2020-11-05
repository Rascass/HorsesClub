package com.java.automation.lab.fall.antonyuk.core22.domain;

public class Factory<T> {

    private final Class<T> type;

    public Factory(Class<T> type) {
        this.type = type;
    }

    public T getInstance() {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}