package ru.mulyukin.java.basic.homework.part2.homework17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MainApply {


    public static void main(String[] args) {
        PoolWork poolWork = new PoolWork();
        ExecutorService serv = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            serv.execute(() -> {
                new Thread(() -> {
                    poolWork.first();
                }).start();
                new Thread(() -> {
                    poolWork.second();
                }).start();
                new Thread(() -> {
                    poolWork.therd();
                }).start();
            });
        }
        serv.shutdown();
    }
}