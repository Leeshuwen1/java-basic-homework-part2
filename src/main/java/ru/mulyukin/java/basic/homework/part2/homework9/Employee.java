package ru.mulyukin.java.basic.homework.part2.homework9;


import java.util.*;


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

    public static List<Employee> print(List<Employee> list) {
        System.out.println(list);
        return list;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Employee> minAge(int min, List<Employee> list) {
        List<Employee> copy = new ArrayList<>();
        for (Employee elem : list) {
            if (min < elem.getAge()) {
                copy.add(elem);
            }
        }
        System.out.println(copy);
        return list;
    }

    public static Integer averageAge(int average, List<Employee> list) throws Exception {
        int ourMiddleAge = 0;
        for (Employee elem : list) {
            if ((ourMiddleAge += elem.getAge() / list.size()) < average) {
            } else {
                throw new Exception("Средний возраст больше");
            }
        }
        System.out.println("Средний возраст  cотрудников " + ourMiddleAge + " < " + "Минимальный средний возраст " + average);
        return -1;
    }

    public static List<Employee> minAgeEmployee(List<Employee> list) {
        int min = list.get(0).getAge();
        for (Employee elem : list) {
            if (elem.getAge() < min) {
                min = elem.getAge();
            }
        }
        System.out.println("Минимальный возраст сотрудника " + min);
        return list;
    }
}


