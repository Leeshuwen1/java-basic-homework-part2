package ru.mulyukin.java.basic.homework.part2.homework17;

public class PoolWork {
    Letters letters = new Letters();
    Object monitor = new Object();


    public synchronized void first() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    if (letters.equals(1)) {
                        monitor.wait();
                    }
                    letters.firstLetter();
                    monitor.notifyAll();
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
                    while ((letters.equals(2))) {
                        monitor.wait();
                    }
                    letters.secondLetter();
                    monitor.notifyAll();
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
                    while ((letters.equals(3))) {
                        monitor.wait();
                    }
                    letters.therdLetter();
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




