package ru.mulyukin.java.basic.homework.part2.homework15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Box<T> {
    private List<T> boxFruit;
    private Fruit fruit;
    private Apple apple;
    private Orange orange;

    public Box(T... boxFruits) {
        this.boxFruit = new ArrayList<>(Arrays.asList(boxFruits));
    }

    public List<T> getBoxFruit() {
        return boxFruit;
    }

    public void setBoxFruit(List<T> boxFruit) {
        this.boxFruit = boxFruit;
    }

    public void addOrange(Integer weigth) {
            boxFruit.add((T) new Orange(weigth));
    }

    public void addApple(Integer weigth) {
            boxFruit.add((T) new Apple(weigth));
    }

    public void addFruits(T weigth) {
            boxFruit.add(weigth);
    }


    public Integer weight() {
        Integer sum = 0;
        System.out.println(Arrays.asList(boxFruit));
        for (int i = 0; i < boxFruit.size(); i++) {
            boxFruit.get(sum += i / boxFruit.size());
            System.out.println(sum);

        }
        System.out.println(sum);
        return sum;
    }

    public boolean compare(Box<?> another) {
        return this.weight() == another.weight();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(boxFruit, box.boxFruit) && Objects.equals(fruit, box.fruit) && Objects.equals(apple, box.apple) && Objects.equals(orange, box.orange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boxFruit, fruit, apple, orange);
    }
}
