package com.example.dockerapplogs;

import java.util.LinkedList;

public class MyList {
    public static volatile Boolean isThreadStopped = false;
    private static LinkedList<Integer> list = new LinkedList();
    private static final Object lock = new Object();

    public static LinkedList<Integer> getList() {
        return new LinkedList<>(list);
    }

    public static void addLast(Integer num) {
        synchronized (lock) {
            list.addLast(num);
        }
    }
}
