package com.java.automation.lab.fall.antonyuk.core22.domain.event.dashboard;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Competition;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Event;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Excursion;

import java.util.ArrayList;
import java.util.List;

class Queries {

    private Queries() {}

    public static List<DashboardInfoItem> getDashboardEventFilter(HorseClub horseClub, Event event) {

        List<Event> events = horseClub.getEvents();
        List<DashboardInfoItem> dashboardInfoItems = new ArrayList<DashboardInfoItem>();
        String eventName = "excursion";
        if (event.getClass() == new Competition().getClass()) {
            eventName = "competition";
        }
        for (Event e: events) {
            if (e.getClass() != event.getClass()) {
                continue;
            }
            dashboardInfoItems.add(new DashboardInfoItem(horseClub.getName(), eventName,
                    e.getStart(), e.getFinish()));
        }
        return dashboardInfoItems;
    }

    public static List<DashboardInfoItem> getDashboardInfo(HorseClub horseClub) {
        List<Event> events = horseClub.getEvents();
        List<DashboardInfoItem> dashboardInfoItems = new ArrayList<DashboardInfoItem>();
        for (Event event: events) {
            String eventName = "excursion";
            if (event.getClass() == new Competition().getClass()) {
                eventName = "competition";
            }
            dashboardInfoItems.add(new DashboardInfoItem(horseClub.getName(), eventName,
                    event.getStart(), event.getFinish()));
        }
        return dashboardInfoItems;
    }

    public static List<DashboardInfoItem> getDashboardCompetition(HorseClub horseClub) {
        return getDashboardEventFilter(horseClub, new Competition());
    }

    public static List<DashboardInfoItem> getDashboardExcursion(HorseClub horseClub) {
        return getDashboardEventFilter(horseClub, new Excursion());
    }
}
