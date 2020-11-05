package com.java.automation.lab.fall.antonyuk.core22.domain.event.eventFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.Factory;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.*;

import java.util.Map;

public class EventFactory {

    private static final Map<EventType, Factory<? extends Event>> types = Map.of(
            EventType.COMPETITION, new Factory<>(Competition.class),
            EventType.EXCURSION, new Factory<>(Excursion.class),
            EventType.MASTERCLASS, new Factory<>(MasterClass.class),
            EventType.TRAINING_GROUP, new Factory<>(TrainingGroup.class)
    );

    private EventFactory() {}

    public static Event createEvent(EventType eventType, EventInfo eventInfo) {
        return types.get(eventType)
                .getInstance()
                .setEventInfo(eventInfo);
    }
}
