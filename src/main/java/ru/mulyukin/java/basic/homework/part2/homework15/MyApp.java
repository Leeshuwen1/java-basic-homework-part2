package ru.mulyukin.java.basic.homework.part2.homework15;

public class MyApp {
    public static void main(String[] args) {

        Box<Integer> boxWithOrange = new Box<>();
        Box<Integer> boxWithApple = new Box<>();
        Box<Integer> boxWithFruits = new Box<>();

        boxWithOrange.addOrange(5);
        boxWithOrange.addOrange(4);
        boxWithOrange.addOrange(3);
        boxWithApple.addApple(4);
        boxWithApple.addApple(3);
        boxWithApple.addApple(3);


        try {
            boxWithOrange.weight();
            boxWithApple.weight();
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка");
            ;
        }
        boxWithOrange.compare(boxWithApple);


    }
}
