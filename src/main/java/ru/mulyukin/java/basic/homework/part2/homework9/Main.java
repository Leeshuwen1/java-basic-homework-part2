package ru.mulyukin.java.basic.homework.part2.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ru.mulyukin.java.basic.homework.part2.homework9.Employee.*;
import static ru.mulyukin.java.basic.homework.part2.homework9.Exercises.*;

public class Main {
    public static void main(String[] args) {
        minMaxArray(10, 50);
        sumMoreFive(new ArrayList<>(Arrays.asList(10, 14, 2, 3, 7, -1, 5, -15, 35, 2)));
        fillArray(7, new ArrayList<>());
        increasingNumber(6, new ArrayList<>());


        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(new Employee("Ivan", 18));
        listEmployee.add(new Employee("Alex", 37));
        listEmployee.add(new Employee("Lisa", 16));
        listEmployee.add(new Employee("Nina", 32));
        listEmployee.add(new Employee("Tanya", 5));


        print(listEmployee);
//        minAge(listEmployee);
//        print(listEmployee);
        averageAge(listEmployee);
        minAgeEmployee(listEmployee);


    }
}
