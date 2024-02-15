package ru.mulyukin.java.basic.homework.part2.homework7;

public class Man implements AllTransport {
    private String name;
    private String currentTransport;
    private Terrain terrain;

    public Man(String name) {
        this.name = name;
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

    @Override
    public boolean drive(int distanse, Terrain terrain) {
        System.out.println("Человек прошёл пешком " + distanse);
        return true;
    }

}
