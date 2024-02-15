package ru.mulyukin.java.basic.homework.part2.homework7;

public class Car implements AllTransport {
    private int distance;
    private int gas;
    private String terrainType;

    public Car(int gas) {
        this.gas = gas;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public boolean drive(int distanse) {
        if ((gas * 70) >= distanse) {
            System.out.println("Челокек проехал на машине " + distanse + " метров");
            return true;
        } else {
            System.out.println("Бензин закончился ");
        }
        return false;
    }
}
