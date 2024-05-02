package ru.mulyukin.java.basic.homework.part2.homework15;


import java.util.*;

import ru.mulyukin.java.basic.homework.part2.homework15.Fruit;

public class Box<T extends Fruit> {
    private List<T> boxFruit;


    public Box(T... boxFruits) {
        this.boxFruit = new ArrayList<>(Arrays.asList(boxFruits));
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

    public void layDown(List<T> anotherBox) {
        anotherBox = new ArrayList<>(Collections.nCopies(boxFruit.size(), (T)null)); // Сначала мы заполняем список ссылками-заглушками.
        Collections.copy(anotherBox, boxFruit);
        boxFruit.clear();
        System.out.println(Arrays.asList(anotherBox));
    }
}
