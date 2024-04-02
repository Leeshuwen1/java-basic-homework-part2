package ru.mulyukin.java.basic.homework.part2.homework14;

public class MyApp {
    public static void main(String[] args) throws InterruptedException {
        long time1 = System.currentTimeMillis();
        arraySpeed(new double[100_000_000]);
        long time2 = System.currentTimeMillis();
        System.out.println("Время на операцию обычного цикла " + (time2 - time1));

        long time3 = System.currentTimeMillis();
        arraySpeedThread(new double[100_000_000]);
        long time4 = System.currentTimeMillis();
        System.out.println("Время на операцию многопоточного цикла " + (time4 - time3));


    }

    private static void arraySpeed(double[] arr) {
        for (int i = 0; i < 100_000_000; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    private static synchronized void arraySpeedThread(double[] arr) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 250_000; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread thread1 = new Thread(() -> {
                for (int i = 250_000; i < 500_000; i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
        });
        Thread thread2 = new Thread(() -> {
                for (int i = 500_000; i < 750_000; i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
        });
        Thread thread3 = new Thread(()-> {
                for (int i = 750_000; i < 100_000_000; i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
        });
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();

        thread.join();
        thread1.join();
        thread2.join();
        thread3.join();

    }
}
