package ru.mulyukin.java.basic.homework.part2.homework10;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(2453732, new Contact("Алексей", "Мулюкин", "ул.Пролетарская 10, кв. 54"));
        phoneBook.addContact(2453121, new Contact("Иван", "Петров", "ул.Мира 15, кв. 10"));
        phoneBook.addContact(2456766, new Contact("Эдуард", "Сигизмунд", "пр.Победы 7, кв.36"));
        phoneBook.addContact(2453099, new Contact("Юрий", "Никулин", "ул.Строителей 2, кв. 78"));
        phoneBook.addContact(2346788, new Contact("Юрий", "Никулин", "ул.Строителей 2, кв. 78"));
        phoneBook.addContact(2457777, new Contact("Майя", "Мулюкина", "ул.Пролетарская 10, кв. 54"));
        phoneBook.addContact(2464444, new Contact("Игорь", "Удалов", "пр.Ильича 8, кв. 63"));
        phoneBook.printContact();
        System.out.println();

        phoneBook.find("Юрий");


        System.out.println();

        phoneBook.containsPhoneNumber(2453099);
        phoneBook.containsPhoneNumber(2346788);
        phoneBook.containsPhoneNumber(0);


    }
}
