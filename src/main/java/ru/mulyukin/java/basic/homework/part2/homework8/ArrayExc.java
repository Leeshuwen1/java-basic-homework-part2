package ru.mulyukin.java.basic.homework.part2.homework8;

import java.util.Arrays;

public class ArrayExc
{
    public static String[][] twoArrays(String[][] array) throws RuntimeException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i > 3 || j > 3) {
                    throw new AppArraySizeException("Вышли за массив");
                }
                System.out.print(Arrays.toString(array[i][j].toCharArray()));
            }
            System.out.println();

        }
        return array;
    }
}
