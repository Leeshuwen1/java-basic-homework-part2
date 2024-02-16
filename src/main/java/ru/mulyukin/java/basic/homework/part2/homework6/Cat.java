package ru.mulyukin.java.basic.homework.part2.homework6;


public class Cat {

    private String name;
    private boolean isHungry;

    public Cat(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean eat(Plate plate) {
        if (isHungry && plate.getCurrentFood() >= 30) {
            System.out.println(name + " голоден");
            plate.returnFood();
            plate.amountOfFoodLeft();
            System.out.println(name + " поел ");
            return true;
        } else {
            System.out.println(name + " не может поесть ");
        }
        return false;

    }
}










