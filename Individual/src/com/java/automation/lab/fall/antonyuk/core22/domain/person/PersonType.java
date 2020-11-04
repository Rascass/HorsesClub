package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import java.nio.file.Path;

public enum PersonType {
    CLIENT("Client"),
    RIDER("Rider"),
    EMPLOYEE("Employee");

    private String name;

    PersonType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
