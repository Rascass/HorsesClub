package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import javax.naming.InvalidNameException;
import java.sql.Date;
import java.util.Objects;

public class Trainer extends Employee{
    private TrainerCategory trainerCategory;

    public Trainer() {
    }

    public Trainer(PersonInfo personInfo, TrainerCategory trainerCategory) {
        super(personInfo);
        this.trainerCategory = trainerCategory;
    }

    public Trainer(PersonInfo personInfo, double salary, TrainerCategory trainerCategory) throws InvalidNameException {
        super(personInfo, salary);
        this.trainerCategory = trainerCategory;
    }

    public Trainer(PersonInfo personInfo, double salary, Date startWork,
                   TrainerCategory trainerCategory) {
        super(personInfo, salary, startWork);
        this.trainerCategory = trainerCategory;
    }

    public Trainer(String firstName, String secondName, String lastName, Date birthday,
                   Gender gender, double salary, Date startWork,
                   TrainerCategory trainerCategory) throws InvalidNameException {
        super(firstName, secondName, lastName, birthday, gender, salary, startWork);
        this.trainerCategory = trainerCategory;
    }

    public TrainerCategory getTrainerCategory() {
        return trainerCategory;
    }

    public void setTrainerCategory(TrainerCategory trainerCategory) {
        this.trainerCategory = trainerCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trainer trainer = (Trainer) o;
        return trainerCategory == trainer.trainerCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trainerCategory);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerCategory=" + trainerCategory +
                '}';
    }
}
