package ru.mulyukin.java.basic.homework.part2.homework7;

public class Bicycle implements AllTransport {

    private int route;
    private String terrainType;

    public Bicycle(int route) {
        this.route = route;
        this.terrainType = terrainType;
    }

    public int getRoute() {
        return route;
    }

    public void setRoute(int route) {
        this.route = route;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public boolean drive(int distanse) {
        System.out.println("Человек проехал на велосипеде " + distanse + " метров");
        return true;
    }
}
