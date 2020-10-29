package com.java.automation.lab.fall.antonyuk.core22.domain.constant;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Env {

    private static Env instance = null;

    private static Path path = Paths.get("src/resources");
    public final static Path BRIDLE_PATH = path.resolve("bridle.dict");
    public final static Path SADDLE_PATH = path.resolve("saddle.dict");
    public final static Path AMMUNITION_PATH = path.resolve("ammunition.dict");
    public final static Path CLIENT_PATH = path.resolve("client.dict");
    public final static Path EMPLOYEE_PATH = path.resolve("employee.dict");
    public final static Path HORSE_PATH = path.resolve("horse.dict");

    private Env() {}

    private Env(String path) {
        this.path = Paths.get(path);
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
