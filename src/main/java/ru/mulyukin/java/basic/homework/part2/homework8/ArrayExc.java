package ru.mulyukin.java.basic.homework.part2.homework8;


public class ArrayExc {
    public static String[][] sumArrays(String[][] array) throws AppArrayDataException, AppArraySizeException{
        int[][] result = new int[array.length][array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 || i > 3 || j > 3) {
                    throw new AppArraySizeException("Вышли за массив");
                }
                if (!array[i][j].matches("[-+]?\\d+")) {
                    throw new AppArrayDataException("Ввели недопустимый символ");
                } else {
                    System.out.print(array[i][j]);
                    result[i][j] = Integer.parseInt(array[i][j]);
                    sum += result[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(sum);
        return array;
    }

}

