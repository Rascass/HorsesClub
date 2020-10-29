package com.java.automation.lab.fall.antonyuk.core22.domain.club;

import com.java.automation.lab.fall.antonyuk.core22.domain.building.RidingHall;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stable;
import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Competition;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Event;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Employee;

import javax.naming.InvalidNameException;
import java.util.List;
import java.util.Objects;

public class HorseClub {

    private String name;
    private Address address;
    private List<Client> clients;
    private List<Horse> horses;
    private List<Employee> employees;
    private RidingHall ridingHall;
    private Stable stable;
    private List<Event> events;

    public HorseClub() {
    }

    public HorseClub(String name, Address address, List<Client> clients, List<Horse> horses,
                     List<Employee> employees, RidingHall ridingHall, Stable stable,
                     List<Event> events) throws InvalidNameException {
        this.setName(name);
        this.address = address;
        this.clients = clients;
        this.horses = horses;
        this.employees = employees;
        this.ridingHall = ridingHall;
        this.stable = stable;
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {
        if (!Validator.isValidName(name)) {
            throw new InvalidNameException();
        }
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public RidingHall getRidingHall() {
        return ridingHall;
    }

    public void setRidingHall(RidingHall ridingHall) {
        this.ridingHall = ridingHall;
    }

    public Stable getStable() {
        return stable;
    }

    public void setStable(Stable stable) {
        this.stable = stable;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HorseClub horseClub = (HorseClub) o;
        return Objects.equals(name, horseClub.name) &&
                Objects.equals(address, horseClub.address) &&
                Objects.equals(clients, horseClub.clients) &&
                Objects.equals(horses, horseClub.horses) &&
                Objects.equals(employees, horseClub.employees) &&
                Objects.equals(ridingHall, horseClub.ridingHall) &&
                Objects.equals(stable, horseClub.stable) &&
                Objects.equals(events, horseClub.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, clients, horses, employees, ridingHall, stable, events);
    }

    @Override
    public String toString() {
        return "HorseClub{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", clients=" + clients +
                ", horses=" + horses +
                ", employees=" + employees +
                ", ridingHall=" + ridingHall +
                ", stable=" + stable +
                ", competitions=" + events +
                '}';
    }


}
