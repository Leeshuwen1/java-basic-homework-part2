package ru.mulyukin.java.basic.homework.part2.homework11;

import java.util.Arrays;

public class BubleSort {
    public static void bubleApp() {
        int[] arr = {10, 4, 6, 3, 7, 6, 15, 7, 17};
        boolean changed = true;
        System.out.println(Arrays.toString(arr));
        while (changed) {
            changed = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    changed = true;
                    int a = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = a;
                }
            }
            if (!changed) {
                break;
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
