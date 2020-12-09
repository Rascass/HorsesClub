package com.java.automation.lab.fall.antonyuk.core22.domain.ammunition;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.AbstractModel;
import com.java.automation.lab.fall.antonyuk.core22.exception.EmptyTypeException;
import com.java.automation.lab.fall.antonyuk.core22.exception.NotSpecifiedSizeException;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

@XmlRootElement(name = "Bridle")
@XmlType(propOrder = {"size", "bridleType"})
public class Bridle extends AbstractModel implements Comparable<Bridle> {

    private BridleSize bridleSize;
    private BridleType bridleType;

    public Bridle() {
    }

    public Bridle(BridleSize bridleSize, BridleType bridleType) throws
            NotSpecifiedSizeException, EmptyTypeException {
        this.setBridleType(bridleType);
        this.setBridleSize(bridleSize);
    }

    public BridleSize getBridleSize() {
        return bridleSize;
    }

    public void setBridleSize(BridleSize bridleSize) throws NotSpecifiedSizeException {
        if (bridleSize == null) {
            throw new NotSpecifiedSizeException();
        }
        this.bridleSize = bridleSize;
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
                "size=" + bridleSize +
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
        return bridleSize == bridle.bridleSize &&
                bridleType == bridle.bridleType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bridleSize, bridleType);
    }

    @Override
    public int compareTo(Bridle o) {
        return this.getBridleSize().ordinal() - o.getBridleSize().ordinal();
    }
}
