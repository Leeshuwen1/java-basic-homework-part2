package ru.mulyukin.java.basic.homework.part2.homework6;


public class Cat {

    private String name;
    private int appetite;
    private boolean isHungry;

    public boolean isHungry() {
        return isHungry;
    }

    public boolean getIsHungry() {
        this.isHungry = true;
        return isHungry;
    }

    public String getName() {
        return name;
    }


    public int getAppetite() {
        return appetite;
    }

    public Cat(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println(this.name + " " + "аппетит " + appetite);
    }


    public void eat(Plate plate) {
        if (isHungry && plate.getMaxFood() > 50) {
            System.out.println(name + " голоден ");
            plate.howMuchFoodEatCat(30);
            appetite += 30;
            System.out.println((name + " поел " + " сытость увеличилась = " + appetite));
            isHungry = false;
        } else {
            System.out.println("Еды не хватило");
        }
    }
}




