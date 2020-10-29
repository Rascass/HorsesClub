package com.java.automation.lab.fall.antonyuk.core22.domain.ammunition;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;

import java.util.Objects;

public class Bridle {

    private BridleSize size;
    private BridleType bridleType;
    private int number;

    public Bridle() {
    }

    public Bridle(BridleSize size, BridleType bridleType, int number) {
        this.size = size;
        this.bridleType = bridleType;
        this.number = number;
    }

    public BridleSize getSize() {
        return size;
    }

    public void setSize(BridleSize size) {
        if (size == null) {
            throw new NullPointerException();
        }
        this.size = size;
    }

    public BridleType getBridleType() {
        return bridleType;
    }

    public void setBridleType(BridleType bridleType) {
        if (bridleType == null) {
            throw new NullPointerException();
        }
        this.bridleType = bridleType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (!Validator.isValidNumber(number) || number == 0) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    @Override
    public String toString() {
        return "Bridle{" +
                "size=" + size +
                ", bridleType=" + bridleType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bridle bridle = (Bridle) o;
        return number == bridle.number &&
                size == bridle.size &&
                bridleType == bridle.bridleType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, bridleType, number);
    }
}
