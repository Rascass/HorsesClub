package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Employee;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Excursion extends Event {

    private Employee guide;
    private double price;
    private int maxPeopleCount;
    private List<Client> clients;

    public Excursion() {}

    public Excursion(EventInfo eventInfo, Employee guide, double price, int maxPeopleCount) {
        super(eventInfo);
        this.guide = guide;
        this.setPrice(price);
        this.setMaxPeopleCount(maxPeopleCount);
    }

    public Excursion(EventInfo eventInfo) {
        super(eventInfo);
    }

    public Excursion(HorseClub horseClub, String name, Date start, Date finish, Employee guide, double price,
            int maxPeopleCount) throws InvalidNameException {
        super(horseClub, name, start, finish);
        this.guide = guide;
        this.setPrice(price);
        this.setMaxPeopleCount(maxPeopleCount);
    }

    public Employee getGuide() {
        return guide;
    }

    public Excursion setGuide(Employee guide) {
        this.guide = guide;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Excursion setPrice(double price) {
        if (!Validator.isValidNumber((int) price)) {
            throw new IllegalArgumentException();
        }
        this.price = price;
        return this;
    }

    public int getMaxPeopleCount() {
        return maxPeopleCount;
    }

    public Excursion setMaxPeopleCount(int maxPeopleCount) {
        if (maxPeopleCount < 1) {
            throw new IllegalArgumentException();
        }
        this.maxPeopleCount = maxPeopleCount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Excursion excursion = (Excursion) o;
        return Double.compare(excursion.price, price) == 0 &&
                maxPeopleCount == excursion.maxPeopleCount &&
                clients == excursion.clients &&
                Objects.equals(guide, excursion.guide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), guide, price, maxPeopleCount, clients);
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "guide=" + guide +
                ", price=" + price +
                ", maxPeopleCount=" + maxPeopleCount +
                ", clients=" + clients +
                '}';
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }
}
