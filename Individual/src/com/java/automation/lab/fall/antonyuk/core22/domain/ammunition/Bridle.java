package com.java.automation.lab.fall.antonyuk.core22.domain.ammunition;

import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.AbstractModel;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.EmptyTypeException;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.NotSpecifiedSizeException;

import java.util.Objects;

public class Bridle extends AbstractModel implements Comparable<Bridle> {

    private BridleSize size;
    private BridleType bridleType;

    public Bridle() {
    }

    public Bridle(BridleSize size, BridleType bridleType) throws
            NotSpecifiedSizeException, EmptyTypeException {
        this.setBridleType(bridleType);
        this.setSize(size);
    }

    public BridleSize getSize() {
        return size;
    }

    public void setSize(BridleSize size) throws NotSpecifiedSizeException {
        if (size == null) {
            throw new NotSpecifiedSizeException();
        }
        this.size = size;
    }

    public BridleType getBridleType() {
        return bridleType;
    }

    public void setBridleType(BridleType bridleType) throws EmptyTypeException {
        if (bridleType == null) {
            throw new EmptyTypeException();
        }
        this.bridleType = bridleType;
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
        return size == bridle.size &&
                bridleType == bridle.bridleType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, bridleType);
    }

    @Override
    public int compareTo(Bridle o) {
        return this.getSize().ordinal() - o.getSize().ordinal();
    }
}
