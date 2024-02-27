package ru.mulyukin.java.basic.homework.part2.homework9;

import java.util.ArrayList;

public interface ListOfEmployees {
    static ArrayList<Employee> print(ArrayList<Employee> employees) {
        System.out.println(employees);
        return employees;
    }
}
