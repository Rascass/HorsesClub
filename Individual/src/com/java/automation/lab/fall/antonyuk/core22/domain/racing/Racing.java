package com.java.automation.lab.fall.antonyuk.core22.domain.racing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Racing {

    private BlockingQueue<Pair> drop;
    private final int participantCount = 3;

    public Racing() {
        this.drop = new ArrayBlockingQueue<>(participantCount, true);
        List<String> horses = new ArrayList<>(Arrays.asList("Legendario", "Delaver", "Glossa"));
        for (int i = 0; i < participantCount; i++) {
            (new Thread(new HorseThread(drop, horses.get(i)))).start();
        }
        (new Thread(new Consumer(drop))).start();
    }
}
