package com.java.automation.lab.fall.antonyuk.core22.domain.event.dashboard;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Competition;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Event;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Excursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dashboard {
    HorseClub horseClub;

    public Dashboard(HorseClub horseClub) {
        this.horseClub = horseClub;
    }

    public HorseClub getHorseClub() {
        return horseClub;
    }

    public void setHorseClub(HorseClub horseClub) {
        this.horseClub = horseClub;
    }

    public List<DashboardInfoItem> getDashboardInfo(HorseClub horseClub) {
        return Queries.getDashboardInfo(this.horseClub);
    }

    public List<DashboardInfoItem> getDashboardCompetition() {
        return Queries.getDashboardCompetition(this.horseClub);
    }

    public List<DashboardInfoItem> getDashboardExcursion() {
        return Queries.getDashboardExcursion(this.horseClub);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dashboard dashboard = (Dashboard) o;
        return Objects.equals(horseClub, dashboard.horseClub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horseClub);
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "horseClub=" + horseClub +
                '}';
    }
}
