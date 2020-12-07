package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import javax.naming.InvalidNameException;
import java.sql.Date;
import java.util.Objects;

public class Groom extends Employee {
    private int numberHorses;

    public Groom(int numberHorses) {
        this.numberHorses = numberHorses;
    }

    public Groom(PersonInfo personInfo, int numberHorses) {
        super(personInfo);
        this.numberHorses = numberHorses;
    }

    public Groom(PersonInfo personInfo, double salary, int numberHorses) {
        super(personInfo, salary);
        this.numberHorses = numberHorses;
    }

    public Groom(PersonInfo personInfo, double salary, Date startWork, int numberHorses) {
        super(personInfo, salary, startWork);
        this.numberHorses = numberHorses;
    }

    public Groom(String firstName, String secondName, String lastName, Date birthday, Gender gender, double salary, Date startWork, int numberHorses) throws InvalidNameException {
        super(firstName, secondName, lastName, birthday, gender, salary, startWork);
        this.numberHorses = numberHorses;
    }

    public int getNumberHorses() {
        return numberHorses;
    }

    public void setNumberHorses(int numberHorses) {
        this.numberHorses = numberHorses;
    }

    @Override
    public String toString() {
        return "Groom{" +
                "numberHorses=" + numberHorses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Groom groom = (Groom) o;
        return numberHorses == groom.numberHorses;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberHorses);
    }
}
