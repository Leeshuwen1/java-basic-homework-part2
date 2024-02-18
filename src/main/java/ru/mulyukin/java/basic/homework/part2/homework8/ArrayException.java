package ru.mulyukin.java.basic.homework.part2.homework8;

public class ArrayException {
    public static String[][] twoArrays(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i > 3 || j > 3) {
                    throw new ArrayIndexOutOfBoundsException("Вышли за массив");
                }
            }
        }
        return array;
    }
}
