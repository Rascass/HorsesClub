package com.java.automation.lab.fall.antonyuk.core22.service;

import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stable;

public class StableService {

    public static synchronized void update(Stable stable, Integer freeStallsCount) {
        stable.setFreeStallsCount(freeStallsCount);
    }
}
