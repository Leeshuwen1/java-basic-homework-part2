package ru.mulyukin.java.basic.homework.part2.homework18;

import java.util.Arrays;
import java.util.List;

public class MaainApply {
    public static void main(String[] args) {

        array(1, 2, 2, 1, 2);


    }

    public static void array(Integer... arr) throws RuntimeException {
        List<Integer> integers = Arrays.asList(arr);
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == 1) {
                int find = integers.lastIndexOf(1);
                List<Integer> result = integers.subList(find + 1, integers.size());
                System.out.println(Arrays.toString(result.toArray()));
            } else {
                throw new RuntimeException("Нет цифры 1");
            }
        }
    }


    @Override
    public String toString() {
        return "MaainApply{}";
    }
}
