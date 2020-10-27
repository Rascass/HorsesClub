package com.java.automation.lab.fall.antonyuk.core22.domain.event.dashboard;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;


import java.util.List;
import java.util.Objects;

public class Dashboard {
    private List<DashboardInfoItem> dashboardInfoItems;
    private HorseClub horseClub;

    public Dashboard() {
    }

    public Dashboard(List<DashboardInfoItem> dashboardInfoItems, HorseClub horseClub) {
        this.horseClub = horseClub;
        this.dashboardInfoItems = dashboardInfoItems;
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

    public List<DashboardInfoItem> getDashboardInfoItems() {
        return dashboardInfoItems;
    }

    public void setDashboardInfoItems(List<DashboardInfoItem> dashboardInfoItems) {
        this.dashboardInfoItems = dashboardInfoItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Dashboard dashboard = (Dashboard) o;
        return Objects.equals(dashboardInfoItems, dashboard.dashboardInfoItems) &&
                Objects.equals(horseClub, dashboard.horseClub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardInfoItems, horseClub);
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "dashboardInfoItem=" + dashboardInfoItems +
                ", horseClub=" + horseClub +
                '}';
    }
}
