package ru.mulyukin.java.basic.homework.part2.homework6;

public class MyApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Том");
        Plate plate = new Plate(true, 100);
        FoodPaket foodPaket = new FoodPaket(100);

        cat.eat(plate);
        plate.isPlate(foodPaket);
        plate.addFood(foodPaket);




    }
}

