package com.example.dockerapplogs.threads;

import com.example.dockerapplogs.MyList;

public class RunnerOne implements Runnable {
    @Override
    public void run() {
        int i = 2;
        while (true) {
            {
                try {
                    Thread.sleep((long) (300 + (Math.random() * (1500 - 300))));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                MyList.addLast(i);
                i = i + 11;
            }
        }
    }
}
