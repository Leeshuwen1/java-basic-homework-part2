package ru.mulyukin.java.basic.homework.part2.homework6;

public class MyApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Tom"),
                new Cat("Timka"),
                new Cat("Proshka")

        };
        Plate plate = new Plate(100);
        FoodPaket foodPaket = new FoodPaket(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.isPlate(cats);
        }
        plate.addFood(foodPaket);


    }
}




