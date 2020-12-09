package com.java.automation.lab.fall.antonyuk.core22.domain.building;

import com.java.automation.lab.fall.antonyuk.core22.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.AbstractModel;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

@XmlRootElement(name = "Stall")
@XmlType(propOrder = {"square", "price", "isFree"})
public class Stall extends AbstractModel implements Comparable<Stall> {

    private int square;
    private int price;
    private boolean isFree;

    public Stall() {
    }

    public Stall(int square, int price, boolean isFree) {
        this.setSquare(square);
        this.setPrice(price);
        this.setIsFree(isFree);
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        checkNumber(square);
        this.square = square;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        checkNumber(price);
        this.price = price;
    }

    public boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(boolean free) {
        isFree = free;
    }

    public void checkNumber(int number) {
        if (!Validator.isValidNumber(number)) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stall stall = (Stall) o;
        return square == stall.square &&
                price == stall.price &&
                isFree == stall.isFree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(square, price, isFree);
    }

    @Override
    public String toString() {
        return "Stall{" +
                " square=" + square +
                ", price=" + price +
                ", isFree=" + isFree +
                "}";
    }

    @Override
    public int compareTo(Stall o) {
        return this.square - o.square;
    }
}
