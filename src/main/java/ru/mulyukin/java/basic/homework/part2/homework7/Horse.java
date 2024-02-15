package ru.mulyukin.java.basic.homework.part2.homework7;

public class Horse implements AllTransport {

    private int distanse;
    private String terrainType;
    private int force;

    public Horse(int force) {
        this.distanse = distanse;
        this.terrainType = terrainType;
        this.force = force;
    }

    public int getDistanse() {
        return distanse;
    }

    public void setDistanse(int distanse) {
        this.distanse = distanse;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public boolean drive(int distanse, Terrain terrain) {
        if ((force * 100) >= distanse && terrain == Terrain.FOREST || terrain == Terrain.PLAIN) {
            System.out.println("Челокек проскакал на коне " + distanse + " метров");
            return true;
        } else if (terrain == Terrain.SWAMP) {
            System.out.println("Конь по болоту не едет ");
            return false;
        } else {
            System.out.println("Конь устал ");
            return false;
        }
    }
}
