package com.java.automation.lab.fall.antonyuk.core22.domain.ammunition;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.AbstractModel;
import com.java.automation.lab.fall.antonyuk.core22.exception.EmptyTypeException;
import com.java.automation.lab.fall.antonyuk.core22.exception.NotSpecifiedSizeException;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

@XmlRootElement(name = "Saddle")
@XmlType(propOrder = {"size", "saddleType"})
public class Saddle extends AbstractModel implements Comparable<Saddle>{

    private double saddleSize;
    private SaddleType saddleType;

    public Saddle() {
    }

    public Saddle(double saddleSize, SaddleType saddleType) {
        this.saddleSize = saddleSize;
        this.saddleType = saddleType;
    }

    public double getSaddleSize() {
        return saddleSize;
    }

    public void setSaddleSize(double saddleSize) throws NotSpecifiedSizeException {
        if (saddleSize <= 1) {
            throw new NotSpecifiedSizeException();
        }
        this.saddleSize = saddleSize;
    }

    public SaddleType getSaddleType() {
        return saddleType;
    }

    public void setSaddleType(SaddleType saddleType) throws EmptyTypeException {
        if (saddleType == null) {
            throw new EmptyTypeException();
        }
        this.saddleType = saddleType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Saddle saddle = (Saddle) o;
        return Double.compare(saddle.saddleSize, saddleSize) == 0 &&
                saddleType == saddle.saddleType &&
                saddleType == saddle.saddleType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(saddleSize, saddleType);
    }

    @Override
    public String toString() {
        return "Saddle{" +
                "size=" + saddleSize +
                ", saddleType=" + saddleType +
                '}';
    }

    @Override
    public int compareTo(Saddle o) {
        double temp = this.getSaddleSize() - o.getSaddleSize();
        if (temp > 0) {
            return 1;
        }
        if (temp < 0) {
            return -1;
        }
        return 0;
    }
}
