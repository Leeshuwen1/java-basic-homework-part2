package ru.mulyukin.java.basic.homework.part2.homework18;

import java.util.Arrays;
import java.util.List;

public class WorkClass {

    private Integer[] arr;

    public WorkClass(Integer... arr) {
        this.arr = arr;
    }

    public static void array(Integer... arr) {
        List<Integer> integers = Arrays.asList(arr);
//        for (Integer elem : integers) {
//            if (elem != 1) {
//                throw new RuntimeException("Нет цифры 1");
//            } else {
        int find = integers.lastIndexOf(1);
        List<Integer> result = integers.subList(find + 1, integers.size());
        System.out.println(Arrays.toString(result.toArray()));
    }

}



