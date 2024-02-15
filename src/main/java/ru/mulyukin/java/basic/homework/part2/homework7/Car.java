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

    @Override
    public boolean drive(int distanse, Terrain terrain) {
        if ((gas * 70) >= distanse && terrain == Terrain.PLAIN) {
            System.out.println("Челокек проехал на машине " + distanse + " метров");
            return true;
        } else if (terrain == Terrain.SWAMP || terrain == Terrain.FOREST) {
            System.out.println("Машина по такой местности не едет ");
            return false;
        } else {
            System.out.println("Закончился бензин ");
            return false;
        }
    }
}
