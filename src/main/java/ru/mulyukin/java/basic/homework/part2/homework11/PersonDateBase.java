package ru.mulyukin.java.basic.homework.part2.homework11;


import java.util.HashMap;

import java.util.Map;

public class PersonDateBase {
    private static Map<Integer, Person> base = new HashMap<>();

    public static void add(Integer integer, Person person) {
        base.put(integer, person);
    }

    public void print() {
        for (Map.Entry<Integer, Person> entry : base.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue().toString();
            System.out.println("Номер " + key + " " + "Имя, Фамилия, должность" + value);
        }
    }

    public Person findId(Integer id) {
        Person person = base.getOrDefault(id, null);
        if (person != null) {
            System.out.println("Сотрудник " + person.getFirstName() + " " + person.getLastName() + ": " + person.getPosition().toString());
        }

        return person;
    }

    public boolean isManager(Person person) {
        if (person == null) {
            return false;
        }
        Position position = person.getPosition();
        return position == Position.SENIOR_MANAGER
                || position == Position.BRANCH_DIRECTOR
                || position == Position.DIRECTOR
                || position == Position.MANAGER;
    }

    public boolean isEmployee(Integer id) {
        if (id == null) {
            return false;
        }
        Person person = base.getOrDefault(id, null);
        Position position = person.getPosition();
        return position == Position.DRIVER
                || position == Position.ENGINEER
                || position == Position.JANITOR
                || position == Position.JUNIOR_DEVELOPER
                || position == Position.PLUMBER
                || position == Position.QA;
    }

}



