package ru.mulyukin.java.basic.homework.part2.homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonDateBase {
    private static Map<Integer, List<Person>> base = new HashMap<>();

    public static void add(Integer integer, Person person) {
        base.computeIfAbsent(integer, k -> new ArrayList<>()).add((person));
    }

    public static void print() {
        for (Map.Entry<Integer, List<Person>> entry : base.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue().toString();
            System.out.println("Номер " + key + " " + "Имя, Фамаилия, должность" + value);
        }
    }

    public static void findId(Integer integer) {
        for (Map.Entry<Integer, List<Person>> entry : base.entrySet()) {
            String value = entry.getValue().toString();
            Integer key = entry.getKey();
            if (key.equals(integer)) {
                System.out.println("Сотрудник " + value);
            }
        }
    }

    public static boolean isManager(String person) {
        for (Map.Entry<Integer, List<Person>> entry : base.entrySet()) {
            String value = entry.getValue().toString();
            Integer key = entry.getKey();
            if (Position.MANAGER.getPosition().contains(person) || Position.SENIOR_MANAGER.getPosition().contains(person)
                    || Position.DIRECTOR.getPosition().contains(person) || Position.BRANCH_DIRECTOR.getPosition().contains(person)) {
                System.out.println("Номер " + key + " " + "Имя, Фамаилия, должность" + value);
                return true;
            } else {
                System.out.println("Не туда");
            }

        }
        return false;
    }

    public static boolean isEmployee(String person) {
        for (Map.Entry<Integer, List<Person>> entry : base.entrySet()) {
            String value = entry.getValue().toString();
            Integer key = entry.getKey();
            if (Position.MANAGER.getPosition().contains(person) || Position.SENIOR_MANAGER.getPosition().contains(person)
                    || Position.DIRECTOR.getPosition().contains(person) || Position.BRANCH_DIRECTOR.getPosition().contains(person)) {
                System.out.println("Не туда");
                return false;
            } else {
                System.out.println("Номер " + key + " " + "Имя, Фамаилия, должность" + value);
            }

        }
        return true;
    }

}



