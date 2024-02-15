package ru.mulyukin.java.basic.homework.part2.homework7;

public class Bicycle implements AllTransport {

    private int manForce;
    private String terrainType;


    public Bicycle(int manForce) {
        this.manForce = manForce;

    }

    public int getManForce() {
        return manForce;
    }

    public void setManForce(int manForce) {
        this.manForce = manForce;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    @Override
    public boolean drive(int distanse, Terrain terrain) {
        if ((manForce * 20) >= distanse && terrain == Terrain.FOREST || terrain == Terrain.PLAIN) {
            System.out.println("Человек проехал на велосипеде " + distanse + " метров");
            return true;
        } else if(terrain == Terrain.SWAMP){
            System.out.println("Велосипед по болоту не едет ");
            return false;
        }else {
            System.out.println("Человек устал ");
            return false;
        }
    }
}



