package com.example.dockerapplogs.threads;

import com.example.dockerapplogs.MyList;

public class RunnerThree implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((long) (300 + (Math.random() * (1500 - 300))));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(MyList.getList().getLast());
        }
    }
}
