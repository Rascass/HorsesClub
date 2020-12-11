package com.java.automation.lab.fall.antonyuk.core22.domain.subscription;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.AbstractModel;

import java.util.Objects;

public class Discount extends AbstractModel implements Comparable<Discount>{

    private String name;
    private int percent;
    private Subscription subscription;

    public Discount() {}

    public Discount(String name, int percent) {
        this.name = name;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discount discount = (Discount) o;
        return percent == discount.percent &&
                Objects.equals(name, discount.name) &&
                Objects.equals(subscription, discount.subscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, percent, subscription);
    }

    @Override
    public String toString() {
        return "Discount{" +
                "name='" + name + '\'' +
                ", percent=" + percent +
                '}';
    }

    @Override
    public int compareTo(Discount o) {
        return this.percent - o.percent;
    }
}
