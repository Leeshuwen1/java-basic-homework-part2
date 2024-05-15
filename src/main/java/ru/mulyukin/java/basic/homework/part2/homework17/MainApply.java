package ru.mulyukin.java.basic.homework.part2.homework17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MainApply {


    public static void main(String[] args) {
        PoolWork poolWork = new PoolWork();
        ExecutorService serv = Executors.newCachedThreadPool();
        for (int i = 0; i < 1; i++) {
            serv.execute(poolWork::first);
            serv.execute(poolWork::second);
            serv.execute(poolWork::therd);
        }
        serv.shutdown();
    }
}