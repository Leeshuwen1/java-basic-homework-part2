package ru.mulyukin.java.basic.homework.part2.homework8;

import java.util.Arrays;


public class SumIntArray {
    public static int sumArray() throws AppArrayDataException {
        String[] string = new String[]{"1", "2", "4", "3"};
        int[] array = Arrays.stream(string).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма массива " + sum);
        return sum;
    }
}





