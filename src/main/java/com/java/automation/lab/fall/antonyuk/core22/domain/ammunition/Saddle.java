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

    private double size;
    private SaddleType saddleType;

    public Saddle() {
    }

    public Saddle(double size, SaddleType saddleType) {
        this.size = size;
        this.saddleType = saddleType;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) throws NotSpecifiedSizeException {
        if (size <= 1) {
            throw new NotSpecifiedSizeException();
        }
        this.size = size;
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
        return Double.compare(saddle.size, size) == 0 &&
                saddleType == saddle.saddleType &&
                saddleType == saddle.saddleType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, saddleType);
    }

    @Override
    public String toString() {
        return "Saddle{" +
                "size=" + size +
                ", saddleType=" + saddleType +
                '}';
    }

    @Override
    public int compareTo(Saddle o) {
        double temp = this.getSize() - o.getSize();
        if (temp > 0) {
            return 1;
        }
        if (temp < 0) {
            return -1;
        }
        return 0;
    }
}
