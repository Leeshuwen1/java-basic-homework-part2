package ru.mulyukin.java.basic.homework.part2.homework17;

public class PoolWork extends Thread{
    Letters letters = new Letters();
    Object monitor = new Object();



    public synchronized void first() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letters.counter != 0) {
                        monitor.wait();
                    }
                    letters.firstLetter();
                    monitor.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void second() {
        synchronized (monitor) {
            try {

                for (int i = 0; i < 5; i++) {
                    while ((letters.counter != 1)) {
                        monitor.wait();
                    }
                    letters.secondLetter();
                    monitor.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void therd() {
        synchronized (monitor) {
            try {

                for (int i = 0; i < 5; i++) {
                    while (letters.counter != 0) {
                        monitor.wait();
                    }
                    letters.therdLetter();
                    monitor.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        super.run();
    }
}




