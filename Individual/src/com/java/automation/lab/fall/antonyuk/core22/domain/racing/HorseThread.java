package com.java.automation.lab.fall.antonyuk.core22.domain.racing;

import java.security.SecureRandom;
import java.util.concurrent.BlockingQueue;

public class HorseThread implements Runnable {

    private BlockingQueue<Pair> drop;
    private int counter = 0;
    private String horse;
    public HorseThread(BlockingQueue<Pair> drop, String horse) {
        this.horse = horse;
        this.drop = drop;
    }

    @Override
    public void run() {
        try {
            while(counter < 1000) {
                counter += new SecureRandom().nextInt(35) + 15;
                drop.put(new Pair(horse, counter));
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
