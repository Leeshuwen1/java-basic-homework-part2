package ru.mulyukin.java.basic.homework.part2.homework9;

import java.util.ArrayList;

public class Exercises {
    public static Integer minMaxArray(int min, int max) {
        ArrayList<Integer> minMaxArr = new ArrayList<>();
        minMaxArr.add(min);
        for (int i = 0; i < minMaxArr.size(); i++) {
            if (min < max) {
                minMaxArr.add(min += 1);
            }
        }
        System.out.println(minMaxArr);
        return min;
    }

    public static Integer sumMoreFive(ArrayList<Integer> integerArrayList) {
        int sum = 0;
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (integerArrayList.get(i) >= 5) {
                sum += integerArrayList.get(i);
            }
        }
        System.out.println(integerArrayList);
        System.out.println("сумма = " + sum);
        return sum;
    }

    public static Integer fillArray(int a, ArrayList<Integer> integerArrayList) {
        for (int i = 0; i < 20; i++) {
            integerArrayList.add(a);
        }
        System.out.println(integerArrayList);
        return a;
    }

    public static Integer increasingNumber(int a, ArrayList<Integer> integerArrayList) {
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(a += a);
        }
        System.out.println(integerArrayList);
        return a;
    }
}
