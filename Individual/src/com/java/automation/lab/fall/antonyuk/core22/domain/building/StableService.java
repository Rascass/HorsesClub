package com.java.automation.lab.fall.antonyuk.core22.domain.building;

public class StableService {

    public static synchronized void update(Stable stable, Integer freeStallsCount) {
        stable.setFreeStallsCount(freeStallsCount);
    }
}
