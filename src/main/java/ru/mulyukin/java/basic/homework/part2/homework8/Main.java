package ru.mulyukin.java.basic.homework.part2.homework8;

import java.util.Scanner;

import static ru.mulyukin.java.basic.homework.part2.homework8.ArrayException.twoArrays;
import static ru.mulyukin.java.basic.homework.part2.homework8.SumIntArray.sumArray;
public class Main {
    public static void main(String[] args)  {

        try {
            twoArrays(new String[][]{{"a", "a", "a", "a", "a"}, {"b", "b", "b", "b", "b"}, {"c", "c", "c", "c", "c"}});
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("индекс массива больше чем заложено программой");
        }
        System.out.println("Завершение программы");


        try {
            sumArray();
        }catch (Exception e){
            System.out.println("В целочисленный массив внесли строку");
        }
        System.out.println("Программа завершена");
    }
}



