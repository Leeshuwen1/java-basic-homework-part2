package ru.mulyukin.java.basic.homework.part2.homework9;

import java.util.ArrayList;
import java.util.Arrays;


import static ru.mulyukin.java.basic.homework.part2.homework9.Employee.*;
import static ru.mulyukin.java.basic.homework.part2.homework9.Exercises.*;


public class Main {
    public static void main(String[] args) {
        try {
            minMaxArray(40, 50);
        } catch (Exception e) {
            System.out.println("Вы ввели не тот символ ");
        }
        System.out.println("Завершение программы ");


        sumMoreFive(new ArrayList<>(Arrays.asList(10, 14, 2, 3, 7, -1, 5, -15, 35, 2)));
        fillArray(7, new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)));
        increasingNumber(6, new ArrayList<>(Arrays.asList(3, 5, 1, 5, 6, 7, 8, 9, 3, 1, 7)));


        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(new Employee("Ivan", 18));
        listEmployee.add(new Employee("Alex", 37));
        listEmployee.add(new Employee("Lisa", 16));
        listEmployee.add(new Employee("Nina", 32));
        listEmployee.add(new Employee("Tanya", 5));


        print(listEmployee);
        try {
            averageAge(35, listEmployee);
        }catch (Exception e){
            System.out.println("Средний возраст сотрудников больше чем заявлен");
        }
        System.out.println("Завершение программы ");

        minAge(25, listEmployee);
        minAgeEmployee(listEmployee);

    }
}
