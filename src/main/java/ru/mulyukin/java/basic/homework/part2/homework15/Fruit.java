package ru.mulyukin.java.basic.homework.part2.homework15;

import java.util.Objects;

public class Fruit {
    private Integer weight;

    public Fruit(Integer weight) {
        this.weight = weight;

    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}
