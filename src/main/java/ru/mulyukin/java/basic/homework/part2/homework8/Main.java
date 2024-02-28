package ru.mulyukin.java.basic.homework.part2.homework8;


import static ru.mulyukin.java.basic.homework.part2.homework8.ArrayExc.sumArrays;

public class Main {
    public static void main(String[] args) throws AppArrayDataException, AppArraySizeException {

        try {
                sumArrays(new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}});

        } catch (AppArraySizeException e) {
            System.out.println("индекс массива больше или меньше чем заложено программой");
        } catch (AppArrayDataException e) {
            System.out.println(" В массиве символ вместо цифры " + e);
        }
        System.out.println("Завершение программы");

    }
}



