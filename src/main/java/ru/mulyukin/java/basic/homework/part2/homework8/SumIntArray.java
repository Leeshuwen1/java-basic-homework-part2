package ru.mulyukin.java.basic.homework.part2.homework8;

import java.util.Arrays;


public class SumIntArray {
    public static int sumArray() throws Exception {
        int[] array = new int[]{3, 5, 7, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (Arrays.asList(array).contains(i)) {
                throw new Exception();
            }
        }
        System.out.println(sum);
        return sum;
    }

}



