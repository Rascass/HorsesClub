package com.java.automation.lab.fall.antonyuk.core22.domain.subscription;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.AbstractModel;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

@XmlRootElement(name = "Contract")
@XmlType(propOrder = {"number", "subscription"})
public class Contract extends AbstractModel {

    private String number;
    private Subscription subscription;

    public Contract() {}

    public Contract(String number, Subscription subscription) {
        this.number = number;
        this.subscription = subscription;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contract contract = (Contract) o;
        return Objects.equals(number, contract.number) &&
                Objects.equals(subscription, contract.subscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, subscription);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number='" + number + '\'' +
                ", subscription=" + subscription +
                '}';
    }
}

