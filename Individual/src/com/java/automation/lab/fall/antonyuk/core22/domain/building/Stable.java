package com.java.automation.lab.fall.antonyuk.core22.domain.building;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;

import java.util.List;
import java.util.Objects;

public class Stable {

    private int freeStallsCount;
    private final List<Stall> stalls;

    public Stable(int freeStallsCount, List<Stall> stalls) {
        this.freeStallsCount = freeStallsCount;
        this.stalls = stalls;
    }

    public int getFreeStallsCount() {
        return freeStallsCount;
    }

    public void setFreeStallsCount(int freeStallsCount) {
        if (!Validator.isValidNumber(freeStallsCount)) {
            throw new IllegalArgumentException();
        }
        this.freeStallsCount = freeStallsCount;
    }

    public List<Stall> getStalls() {
        return stalls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stable stable = (Stable) o;
        return freeStallsCount == stable.freeStallsCount &&
                Objects.equals(stalls, stable.stalls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeStallsCount, stalls);
    }

    @Override
    public String toString() {
        return "Stable{" +
                "freeStallsCount=" + freeStallsCount +
                ", stalls=" + stalls +
                '}';
    }
}
