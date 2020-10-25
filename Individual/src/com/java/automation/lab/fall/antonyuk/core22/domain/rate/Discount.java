package com.java.automation.lab.fall.antonyuk.core22.domain.rate;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;

import javax.naming.InvalidNameException;
import java.util.Objects;

public class Discount {

    String title;
    int percent;

    public Discount() {
    }

    public Discount(String title, int percent) throws InvalidNameException {
        this.setTitle(title);
        this.setPercent(percent);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws InvalidNameException {
        if (!Validator.isValidName(title)) {
            throw new InvalidNameException();
        }
        this.title = title;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        if (percent < 0) {
            throw new IllegalArgumentException();
        }
        this.percent = percent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Discount discount = (Discount) o;
        return percent == discount.percent &&
                Objects.equals(title, discount.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, percent);
    }

    @Override
    public String toString() {
        return "Discount{" +
                "title='" + title + '\'' +
                ", percent=" + percent +
                '}';
    }
}
