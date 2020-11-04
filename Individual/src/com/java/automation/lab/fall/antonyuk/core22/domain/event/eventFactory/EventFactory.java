package com.java.automation.lab.fall.antonyuk.core22.domain.event.eventFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.Factory;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.*;

import java.util.Map;

public class EventFactory {

    private static final Map<EventType, Class> types = Map.of(
            EventType.COMPETITION, Competition.class,
            EventType.EXCURSION, Excursion.class,
            EventType.MASTERCLASS, MasterClass.class,
            EventType.TRAINING_GROUP, TrainingGroup.class
    );

    private EventFactory() {}

    public static Event createEvent(EventType eventType) {
        return (Event) Factory.getFactory(types.get(eventType))
                .getInstance();
    }
}
