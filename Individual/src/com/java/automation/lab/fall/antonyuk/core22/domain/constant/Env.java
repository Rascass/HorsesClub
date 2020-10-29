package com.java.automation.lab.fall.antonyuk.core22.domain.constant;

public class Env {

    private static Env instance = null;

    private String path = "/Users/anaantonuk/IdeaProjects/Individual/src/resources/";
    public final String BRIDLE = "bridle.dict";
    public final String SADDLE = "saddle.dict";
    public final String AMMUNITION = "ammunition.dict";
    public final String CLIENT = "client.dict";
    public final String EMPLOYEE = "employee.dict";
    public final String EVENT = "event.dict";
    public final String HORSE = "horse.dict";

    private Env() {}

    private Env(String path) {
        this.path = path;
    }

    public static Env getInstance() {
        if (instance == null) {
            instance = new Env();
        }
        return instance;
    }

    public static Env getInstance(String path) {
        if (instance == null) {
            instance = new Env(path);
        }
        return instance;
    }
}
