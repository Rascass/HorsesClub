package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Competition extends Event {

    private int sumPrize;
    private List<Unit> participants;
    private Unit winner;
    private Specialization specialization;

    public Competition() {
    }

    public Competition(EventInfo eventInfo) {
        super(eventInfo);
    }

    public Competition(EventInfo eventInfo, int sumPrize, List<Unit> participants, Unit winner,
                       Specialization specialization) {
        super(eventInfo);
        this.setSumPrize(sumPrize);
        this.setParticipants(participants);
        this.setWinner(winner);
        this.setSpecialization(specialization);
    }

    public Competition(HorseClub horseClub, String name, Date start, Date finish,
                       int sumPrize, List<Unit> participants, Unit winner,
                       Specialization specialization) throws InvalidNameException {
        super(horseClub, name, start, finish);
        this.setSumPrize(sumPrize);
        this.setParticipants(participants);
        this.setWinner(winner);
        this.setSpecialization(specialization);
    }

    public int getSumPrize() {
        return sumPrize;
    }

    public void setSumPrize(int sumPrize) {
        if (!Validator.isValidNumber(sumPrize)) {
            throw new IllegalArgumentException();
        }
        this.sumPrize = sumPrize;
    }

    public List<Unit> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Unit> participants) {
        this.participants = participants;
    }

    public Unit getWinner() {
        return winner;
    }

    public void setWinner(Unit winner) {
        this.winner = winner;
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
        Competition that = (Competition) o;
        return sumPrize == that.sumPrize &&
                Objects.equals(participants, that.participants) &&
                Objects.equals(winner, that.winner) &&
                specialization == that.specialization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sumPrize, participants, winner, specialization);
    }

    @Override
    public String toString() {
        return "Competition{" +
                "sumPrize=" + sumPrize +
                ", participants=" + participants +
                ", winner=" + winner +
                ", specialization=" + specialization +
                '}';
    }
}
