package com.java.automation.lab.fall.antonyuk.core22.domain.rate;

import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stall;

import java.util.Objects;

public class StallSubscription extends Subscription{

    Stall stall;

    public StallSubscription() {
    }

    public StallSubscription(Stall stall) {
        this.stall = stall;
    }

    public Stall getStall() {
        return stall;
    }

    public void setStall(Stall stall) {
        this.stall = stall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StallSubscription stallSubscription = (StallSubscription) o;
        return Objects.equals(stall, stallSubscription.stall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stall);
    }

    @Override
    public String toString() {
        return "Rate{ stall = " + stall +
                '}';
    }
}
