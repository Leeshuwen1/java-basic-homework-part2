package ru.mulyukin.java.basic.homework.part2.homework9;


import java.util.*;


public class Employee implements ListOfEmployees {

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


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Employee> minAge(int min, List<Employee> list) {
        List<Employee> copy = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (min < list.get(i).getAge()) {
                copy.add(list.get(i));
            }
        }
        System.out.println(copy);
        return list;
    }

    public static boolean averageAge(int average, List<Employee> list) {
        int ourMiddleAge = 0;
        for (Employee elem : list) {
            ourMiddleAge += elem.getAge(); // list.size();
            System.out.println("Средний возраст = " + ourMiddleAge);
            if (ourMiddleAge / list.size() < average) {
                System.out.println("Средний возраст " + ourMiddleAge + " < " + average);
                return true;
            } else {
                System.out.println("Средний возраст " + ourMiddleAge + " > " + average);

            }
        }
        return false;
    }

    public static List<Employee> minAgeEmployee(List<Employee> list) {
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


