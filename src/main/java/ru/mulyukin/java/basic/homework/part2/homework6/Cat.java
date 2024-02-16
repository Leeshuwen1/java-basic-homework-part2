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
        return true;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean eat(Plate plate) {
        if (isHungry && plate.getCurrentFood() >= 30) {
            System.out.println(name + " голоден");
            plate.amountOfFoodLeft();
            System.out.println(name + " поел " + plate.getCurrentFood());
            return true;
        } else {
            System.out.println("Кот не может поесть ");
        }
        return false;
    }
}










