package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.AbstractModel;

import javax.naming.InvalidNameException;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.Objects;

@XmlRootElement(name = "Event")
public abstract class Event extends AbstractModel {

    private EventInfo eventInfo;

    public Event() {
    }

    public Event(EventInfo eventInfo) {
        this.eventInfo = eventInfo;
    }

    public Event(HorseClub horseClub, String name, Date start, Date finish) throws InvalidNameException {
        this.eventInfo = new EventInfo(horseClub, name, start, finish);
    }

    public HorseClub getHorseClub() {
        return eventInfo.getHorseClub();
    }

    public void setHorseClub(HorseClub horseClub) {
        this.eventInfo.setHorseClub(horseClub);
    }

    public String getName() {
        return eventInfo.getName();
    }

    public void setName(String name) throws InvalidNameException {
        if (!Validator.isValidName(name)) {
            throw new InvalidNameException();
        }
        this.eventInfo.setName(name);
    }

    public EventInfo getEventInfo() {
        return eventInfo;
    }

    public Event setEventInfo(EventInfo eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }

    public Date getStart() {
        return eventInfo.getStart();
    }

    public Event setStart(Date start) {
        this.eventInfo.setStart(start);
        return null;
    }

    public Date getFinish() {
        return eventInfo.getFinish();
    }

    public Event setFinish(Date finish) {
        this.setFinish(finish);
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
        Event event = (Event) o;
        return Objects.equals(eventInfo, event.eventInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventInfo);
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventInfo=" + eventInfo +
                '}';
    }
}
