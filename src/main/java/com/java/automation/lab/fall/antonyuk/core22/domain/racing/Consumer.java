package com.java.automation.lab.fall.antonyuk.core22.domain.racing;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Pair> drop;

    public Consumer(BlockingQueue<Pair> drop) {
        this.drop = drop;
    }

    public void run() {
        Pair msg = null;
        try {
            do {
                msg = drop.take();
                System.out.println(msg.distance + " - " + msg.name);
            } while(msg.distance < 300);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("winner is " + msg.name);
    }
}
