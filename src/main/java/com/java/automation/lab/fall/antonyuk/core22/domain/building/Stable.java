package com.java.automation.lab.fall.antonyuk.core22.domain.building;

import com.java.automation.lab.fall.antonyuk.core22.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.AbstractModel;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@XmlRootElement(name = "Stable")
@XmlType(propOrder = {"freeStallsCount", "stalls"})
public class Stable extends AbstractModel implements Comparable<Stable>{

    private int freeStallsCount;
    private final Set<Stall> stalls;

    public Stable() {
        stalls = new HashSet<>();
    }

    public Stable(int freeStallsCount, Set<Stall> stalls) {
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

    public Set<Stall> getStalls() {
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

    @Override
    public int compareTo(Stable o) {
        return this.getStalls().size() - o.getStalls().size();
    }
}
