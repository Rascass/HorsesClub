package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Rider;
import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MasterClass extends Event {

    private Rider mentor;
    private List<Unit> participants;
    private int price;
    private Specialization specialization;

    public MasterClass(EventInfo eventInfo) {
        super(eventInfo);
    }

    public MasterClass(EventInfo eventInfo, Rider mentor, List<Unit> participants, int price,
                       Specialization specialization) {
        super(eventInfo);
        this.mentor = mentor;
        this.participants = participants;
        this.setPrice(price);
        this.specialization = specialization;
    }

    public MasterClass(HorseClub horseClub, String name, Date start, Date finish,
                       Rider mentor, List<Unit> participants, int price,
                       Specialization specialization) throws InvalidNameException {
        super(horseClub, name, start, finish);
        this.mentor = mentor;
        this.participants = participants;
        this.setPrice(price);
        this.specialization = specialization;
    }

    public Rider getMentor() {
        return mentor;
    }

    public void setMentor(Rider mentor) {
        this.mentor = mentor;
    }

    public List<Unit> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Unit> participants) {
        this.participants = participants;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 1) {
            throw new IllegalArgumentException();
        }
        this.price = price;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
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
        MasterClass that = (MasterClass) o;
        return price == that.price &&
                Objects.equals(mentor, that.mentor) &&
                Objects.equals(participants, that.participants) &&
                specialization == that.specialization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mentor, participants, price, specialization);
    }

    @Override
    public String toString() {
        return "MasterClass{" +
                "mentor=" + mentor +
                ", participants=" + participants +
                ", price=" + price +
                ", specialization=" + specialization +
                '}';
    }
}
