package ru.mulyukin.java.basic.homework.part2.homework7;

public class Man implements AllTransport {
    private String name;
    private String currentTransport;

    public Man(String name) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(String currentTransport) {
        this.currentTransport = currentTransport;
    }
    public boolean drive(int distanse) {
        System.out.println("Человек прошол пешком " + distanse);
        return true;
    }
}
