package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Employee;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class TrainingGroup extends Event{

    Employee trainer;
    List<Client> pupils;

    public TrainingGroup(EventInfo eventInfo, Employee trainer, List<Client> pupils) {
        super(eventInfo);
        this.trainer = trainer;
        this.pupils = pupils;
    }

    public TrainingGroup(HorseClub horseClub, String name, Date start, Date finish,
                         Employee trainer, List<Client> pupils) throws InvalidNameException {
        super(horseClub, name, start, finish);
        this.trainer = trainer;
        this.pupils = pupils;
    }

    public Employee getTrainer() {
        return trainer;
    }

    public void setTrainer(Employee trainer) {
        this.trainer = trainer;
    }

    public List<Client> getPupils() {
        return pupils;
    }

    public void setPupils(List<Client> pupils) {
        this.pupils = pupils;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrainingGroup that = (TrainingGroup) o;
        return Objects.equals(trainer, that.trainer) &&
                Objects.equals(pupils, that.pupils);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trainer, pupils);
    }

    @Override
    public String toString() {
        return "TrainingGroup{" +
                "trainer=" + trainer +
                ", pupils=" + pupils +
                '}';
    }
}
