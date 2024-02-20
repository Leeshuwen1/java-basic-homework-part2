package ru.mulyukin.java.basic.homework.part2.homework8;

import java.util.Scanner;

import static ru.mulyukin.java.basic.homework.part2.homework8.ArrayExc.twoArrays;
import static ru.mulyukin.java.basic.homework.part2.homework8.SumIntArray.sumArray;

public class Main {
    public static void main(String[] args) throws Exception, AppArrayDataException {

        try {
            twoArrays(new String[][]{{"a", "a", "a", "a"}, {"b", "b", "b", "b"}, {"c", "c", "c", "c"}});
        } catch (AppArraySizeException e) {
            System.out.println("индекс массива больше чем заложено программой");
        }
        System.out.println("Завершение программы");

        try {
            sumArray();
        }catch (NumberFormatException e){
            System.out.println("В массиве буква " + e);
        }
        System.out.println("Программа завершена");
    }

}



