package ru.mulyukin.java.basic.homework.part2.homework6;

public class MyApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Tom", true),
                new Cat("Timka", true),
                new Cat("Proshka", true)

        };
        Plate plate = new Plate(100, 100);
        FoodPaket foodPaket = new FoodPaket(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);

        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        plate.addFood(foodPaket);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }


    }


}





