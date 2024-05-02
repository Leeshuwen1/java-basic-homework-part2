package ru.mulyukin.java.basic.homework.part2.homework16;

import java.util.Scanner;

public class MainApplycation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWorks fileWorks = new FileWorks();
        System.out.println("Добро пожаловать в SSW (System Search Words");
        System.out.println("Выберите файл и из списка и введите искомое значение");
        fileWorks.searchFile();
        fileWorks.readFile(scanner.nextLine());
        System.out.println();
        fileWorks.searchWord(scanner.nextLine(), scanner.nextLine());
    }
}

