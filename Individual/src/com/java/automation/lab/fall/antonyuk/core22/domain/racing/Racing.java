package com.java.automation.lab.fall.antonyuk.core22.domain.racing;

import com.java.automation.lab.fall.antonyuk.core22.domain.event.Unit;

import java.util.ArrayList;
import java.util.List;

public class Racing {

    List<Unit> particiants;

    public Racing(List<Unit> particiants) {
        this.particiants = particiants;
    }

    public Racing() {
        this.particiants = new ArrayList<>();
    }

    public List<Unit> getParticiants() {
        return particiants;
    }

    public void setParticiants(List<Unit> particiants) {
        this.particiants = particiants;
    }
}
