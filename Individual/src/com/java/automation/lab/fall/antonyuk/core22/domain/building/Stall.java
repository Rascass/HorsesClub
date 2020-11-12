package com.java.automation.lab.fall.antonyuk.core22.domain.building;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.AbstractModel;

import java.util.Objects;

public class Stall extends AbstractModel implements Comparable<Stall> {

    private int square;
    private int price;
    private boolean isFree;

    public Stall() {
    }

    public Stall(int square, int price, boolean isFree) {
        this.setSquare(square);
        this.setPrice(price);
        this.setFree(isFree);
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

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
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
                ", square=" + square +
                ", price=" + price +
                ", isFree=" + isFree +
                '}';
    }

    @Override
    public int compareTo(Stall o) {
        return this.square - o.square;
    }
}
