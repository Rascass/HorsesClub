package com.java.automation.lab.fall.antonyuk.core22.domain.subscription;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.AbstractModel;

import javax.naming.InvalidNameException;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.*;

@XmlRootElement(name = "Subscription")
@XmlType(propOrder = {"start", "finish", "price", "startPrice", "discounts"})
public class Subscription extends AbstractModel{

    private Date start;
    private Date finish;
    private double price;
    private double startPrice;
    private List<Discount> discounts;

    public Subscription() {
        discounts = new ArrayList<>();
    }

    public Subscription(Date start, Date finish, double startPrice, List<Discount> discounts) {
        this.start = start;
        this.finish = finish;
        this.startPrice = startPrice;
        this.discounts = discounts;
        this.setPrice();
        for (Discount d: this.discounts) {
            d.setSubscription(this);
        }
    }

    public Subscription(Date start, Date finish, double startPrice) {
        this.start = start;
        this.finish = finish;
        this.startPrice = startPrice;
        this.discounts =  new ArrayList<>();
        this.setPrice();
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        if (discounts.size() < 1) {
            this.price = startPrice;
        } else {
            int percent = discounts.stream().mapToInt(el->el.getPercent()).sum();
            this.price = startPrice + startPrice * (percent / 100);
        }
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public int maxDiscountPersent() {
        int max = 0;
        for (Discount d: discounts) {
            if (d.getPercent() > max) {
                max = d.getPercent();
            }
        }
        return max;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }

    public void addDiscount(Discount discount) throws InvalidNameException {
        if (discount.getPercent() < 1) {
            throw new IllegalArgumentException();
        }
        if (discount.getName().length() < 1) {
            throw new InvalidNameException();
        }
        discount.setSubscription(this);
        discounts.add(discount);
        setPrice();
    }

    public void deleteDiscount(String name) {
        discounts.remove(name);
        setPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return Double.compare(that.price, price) == 0 &&
                Double.compare(that.startPrice, startPrice) == 0 &&
                Objects.equals(start, that.start) &&
                Objects.equals(finish, that.finish) &&
                Objects.equals(discounts, that.discounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, finish, price, startPrice);
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "start=" + start +
                ", finish=" + finish +
                ", price=" + price +
                ", startPrice=" + startPrice +
                ", discounts=" + discounts +
                '}';
    }
}
