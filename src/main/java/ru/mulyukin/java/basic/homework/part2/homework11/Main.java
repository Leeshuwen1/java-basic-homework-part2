package ru.mulyukin.java.basic.homework.part2.homework11;

import java.util.Arrays;

import static ru.mulyukin.java.basic.homework.part2.homework11.BubleSort.bubleApp;

public class Main {
    public static void main(String[] args) {

        PersonDateBase personDateBase = new PersonDateBase();


        personDateBase.add(1, new Person("Игорь", "Сидоров", Position.MANAGER));
        personDateBase.add(2, new Person("Иван", "Петров", Position.DIRECTOR));
        personDateBase.add(3, new Person("Алексей", "Мулюкин", Position.DRIVER));
        personDateBase.add(4, new Person("Александр", "Колдаев", Position.ENGINEER));
        personDateBase.add(5, new Person("Мария", "Гришель", Position.SENIOR_MANAGER));
        personDateBase.add(6, new Person("Жанна", "Агузарова", Position.DEVELOPER));
        personDateBase.add(7, new Person("Майя", "Мулюкина", Position.QA));
        personDateBase.add(8, new Person("Борис", "Васильев", Position.JANITOR));
        personDateBase.add(9, new Person("Роман", "Романов", Position.PLUMBER));
        personDateBase.add(10, new Person("Елена", "Домагарова", Position.BRANCH_DIRECTOR));
        personDateBase.add(11, new Person("Алексей", "Пучков", Position.JUNIOR_DEVELOPER));


        personDateBase.isEmployee(5);

        bubleApp();

    }
}

