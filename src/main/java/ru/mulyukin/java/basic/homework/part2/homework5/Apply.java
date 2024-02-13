package ru.mulyukin.java.basic.homework.part2.homework5;

public class Apply {
    public static void main(String[] args) {


        Cat cat = new Cat("Tom", 7, 93);
        Dog dog = new Dog("Maty", 3, 110, 5, 2);
        Horse horse = new Horse("Plotva", 4, 164, 15, 4);


        dog.info();
        dog.swim(1100);
        cat.info();
        cat.swim(40);
        horse.info();
        horse.swim(1000);
        cat.swim(500);
        dog.swim(15);


        cat.info();
        cat.run(30);
        dog.info();
        dog.run(50);
        horse.info();
        horse.run(500);
    }
}


