package com.java.automation.lab.fall.antonyuk.core22.domain.event.eventFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.Factory;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.EventInfo;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Excursion;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.TypeExcursion;

import java.util.Date;
import java.util.Map;

public class ExcursionFactory {

    private final static long HOUR = 3600000;
    private final static Map<TypeExcursion, Long> types = Map.of(
            TypeExcursion.FAST, HOUR,
            TypeExcursion.MIDDLE, 2 * HOUR,
            TypeExcursion.FULL, 3 * HOUR
    );

    private static Date getFinish(Date start, long hours) {
        return new Date(start.getTime() + hours);
    }

    public static Excursion createExcursion(EventInfo eventInfo, TypeExcursion typeExcursion, Date startDate) {
        long finishDiff = types.get(typeExcursion);
        return (Excursion) EventFactory.createEvent(EventType.EXCURSION, eventInfo)
                .setStart(startDate)
                .setFinish(getFinish(startDate, finishDiff));
    }
}