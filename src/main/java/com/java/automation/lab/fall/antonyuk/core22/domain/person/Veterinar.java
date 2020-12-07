package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import javax.naming.InvalidNameException;
import java.sql.Date;
import java.util.Objects;

public class Veterinar extends Employee {
    private String profSpecialization;

    public Veterinar() {}

    public Veterinar(String profSpecialization) {
        this.profSpecialization = profSpecialization;
    }

    public Veterinar(PersonInfo personInfo, String profSpecialization) {
        super(personInfo);
        this.profSpecialization = profSpecialization;
    }

    public Veterinar(PersonInfo personInfo, double salary, String profSpecialization) {
        super(personInfo, salary);
        this.profSpecialization = profSpecialization;
    }

    public Veterinar(PersonInfo personInfo, double salary, Date startWork,
                     String profSpecialization) {
        super(personInfo, salary, startWork);
        this.profSpecialization = profSpecialization;
    }

    public Veterinar(String firstName, String secondName, String lastName,
                     Date birthday, Gender gender, double salary, Date startWork,
                     String profSpecialization) throws InvalidNameException {
        super(firstName, secondName, lastName, birthday, gender, salary, startWork);
        this.profSpecialization = profSpecialization;
    }

    public String getProfSpecialization() {
        return profSpecialization;
    }

    public void setProfSpecialization(String profSpecialization) {
        this.profSpecialization = profSpecialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Veterinar veterinar = (Veterinar) o;
        return Objects.equals(profSpecialization, veterinar.profSpecialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), profSpecialization);
    }

    @Override
    public String toString() {
        return "Veterinar{" +
                "profSpecialization='" + profSpecialization + '\'' +
                '}';
    }
}
