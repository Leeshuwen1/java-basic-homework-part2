package ru.mulyukin.java.basic.homework.part2.homework9;


import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public static ArrayList<Employee> print(ArrayList<Employee> employees) {
        System.out.println(employees);
        return employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static ArrayList<Employee> minAge(ArrayList<Employee> list) {
        int minAge = 25;
        Iterator<Employee> iter = list.iterator();
        while (iter.hasNext()) {
            Integer chislo = iter.next().getAge();
            if (chislo <= minAge) {
                iter.remove();
            }
        }
        return list;
    }

    public static ArrayList<Employee> averageAge(ArrayList<Employee> list) {
        int average = 30;
        int ourMiddleAge = 0;
        for (int i = 0; i < list.size(); i++) {
            ourMiddleAge += list.get(i).getAge() / list.size();
            System.out.println("Средний возраст = " + ourMiddleAge);
            if (ourMiddleAge < average) {
                System.out.println("Средний возраст " + ourMiddleAge + " < " + average);
            } else {
                System.out.println("Средний возраст " + ourMiddleAge + " > " + average);
            }
        }
        return list;
    }

    public static ArrayList<Employee> minAgeEmployee(ArrayList<Employee> list) {
        int min = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() < min) {
                min = list.get(i).getAge();

            }
        }
        System.out.println("Минимальный возраст сотрудника " + min);
        return list;
    }

}


