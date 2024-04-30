package ru.mulyukin.java.basic.homework.part2.homework15;


import java.util.*;

import ru.mulyukin.java.basic.homework.part2.homework15.Fruit;

public class Box<T extends Fruit> {
    private List<T> boxFruit;
    private List<?> apple;
    private List<?> orange;


    public Box(T... boxFruits) {
        this.boxFruit = new ArrayList<>(Arrays.asList(boxFruits));
        this.apple = new ArrayList<>(Arrays.asList(apple));
        this.orange = new ArrayList<>(Arrays.asList(orange));
    }

    public List<T> getBoxFruit() {
        return boxFruit;
    }

    public void setBoxFruit(List<T> boxFruit) {
        this.boxFruit = boxFruit;
    }


    public void add(T fruit) {
            boxFruit.add(fruit);
    }


    public Integer weight() {
        Integer sum = 0;
        for (int i = 0; i < boxFruit.size(); i++) {
            sum += boxFruit.get(i).getWeight();
        }
        return sum / boxFruit.size();
    }

    public boolean compare(Box<?> another) {
        return Objects.equals(this.weight(), another.weight());
    }

    public void layDown() {
        Collections.copy(boxFruit, boxFruit);
        System.out.println(Arrays.asList(boxFruit));
    }
}
