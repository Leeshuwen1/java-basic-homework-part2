package ru.mulyukin.java.basic.homework.part2.homework15;

import java.util.Collections;

public class MyApp {
    public static void main(String[] args) {

        Box<Fruit> boxWithOrange = new Box<>();
        Box<Fruit> boxWithApple = new Box<>();



        boxWithOrange.add(new Orange(2));
        boxWithOrange.add(new Orange(2));
        boxWithOrange.add(new Orange(2));
        boxWithApple.add(new Apple(2));
        boxWithApple.add(new Apple(2));
        boxWithApple.add(new Apple(2));


        try {
            System.out.println("Средний вес коробки с апельсинами" + " " + boxWithOrange.weight() + " КГ");
            System.out.println("Средний вес коробки с яблоками" + " " + boxWithApple.weight() + " КГ");
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка");
            ;
        }

        System.out.println(boxWithOrange.compare(boxWithApple));


        try{
            boxWithApple.layDown();
            boxWithOrange.layDown();
        }catch (Exception e){
            System.out.println("Ошибка " + e);
        }

    }
}
