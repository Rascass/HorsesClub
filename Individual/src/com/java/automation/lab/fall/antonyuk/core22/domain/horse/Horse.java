package com.java.automation.lab.fall.antonyuk.core22.domain.horse;

import com.java.automation.lab.fall.antonyuk.core22.domain.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Ammunition;
import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Age;
import com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao.AbstractModel;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.NotSpecifiedBirthdayException;

import javax.naming.InvalidNameException;
import java.util.*;

public abstract class Horse extends AbstractModel {

    private HorseInfo horseInfo;

    public Horse() {
    }

    public Horse(HorseInfo horseInfo) {
        this.horseInfo = horseInfo;
    }

    public Horse(String name, Date wasBorn, Specialization specialization, Pedigree pedigree,
                 Set<Ammunition> ammunition, HorseSuit horseSuit) throws InvalidNameException {
        this.horseInfo = new HorseInfo(name, wasBorn, specialization, pedigree, ammunition, horseSuit);
    }

    public String getName() {
        return this.horseInfo.getName();
    }

    public void setName(String name) throws InvalidNameException {
        this.horseInfo.setName(name);
    }

    public Date getWasBorn() {
        return this.horseInfo.getWasBorn();
    }

    public void setWasBorn(Date wasBorn) throws NotSpecifiedBirthdayException {
        if (wasBorn == null) {
            throw new NotSpecifiedBirthdayException();
        }
        this.horseInfo.setWasBorn(wasBorn);
    }

    public Specialization getSpecialization() {
        return this.horseInfo.getSpecialization();
    }

    public Horse setSpecialization(Specialization specialization) {
        this.horseInfo.setSpecialization(specialization);
        return this;
    }

    public Pedigree getPedigree() {
        return this.horseInfo.getPedigree();
    }

    public void setPedigree(Pedigree pedigree) {
        this.horseInfo.setPedigree(pedigree);
    }

    public Horse setHorseSuit(HorseSuit horseSuit) {
        this.horseInfo.setHorseSuit(horseSuit);
        return this;
    }

    public HorseSuit getHorseSuit() {
        return this.horseInfo.getHorseSuit();
    }

    public int getAge() {
        return Age.getAge(getWasBorn());
    }

    public Set<Ammunition> getAmmunition() {
        return this.horseInfo.getAmmunition();
    }

    public void setAmmunition(Set<Ammunition> ammunition) {
        this.horseInfo.setAmmunition(ammunition);
    }

    public HorseInfo getHorseInfo() {
        return horseInfo;
    }

    public Horse setHorseInfo(HorseInfo horseInfo) {
        this.horseInfo = horseInfo;
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
        Horse horse = (Horse) o;
        return Objects.equals(horseInfo, horse.horseInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horseInfo);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseInfo=" + horseInfo +
                '}';
    }
}
