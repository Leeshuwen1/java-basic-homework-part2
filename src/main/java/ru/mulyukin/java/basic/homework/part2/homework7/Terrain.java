package ru.mulyukin.java.basic.homework.part2.homework7;

public enum Terrain {
    FOREST(1),
    PLAIN(2),
    SWAMP(3);

    private int terrain1;

    Terrain(int terrain) {
        this.terrain1 = terrain;
    }

    public int getTerrain(int terrain) {
        return terrain;
    }
}
