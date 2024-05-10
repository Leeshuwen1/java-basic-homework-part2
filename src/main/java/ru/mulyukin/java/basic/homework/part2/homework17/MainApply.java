package ru.mulyukin.java.basic.homework.part2.homework17;

public class MainApply {



    public static void main(String[] args) {
        PoolWork poolWork = new PoolWork();

        new Thread(() -> {
            poolWork.first();
        }).start();
        new Thread(() -> {
            poolWork.second();
        }).start();
        new Thread(() -> {
            poolWork.therd();
        }).start();
    }


}