package ru.mulyukin.java.basic.homework.part2.homework10;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("Мулюкин Алексей Владимирович", 2453732));
        phoneBook.addContact(new Contact("Петров Иван Иванович", 2453121));
        phoneBook.addContact(new Contact("Сигизмунд Эдуард Олегович", 2456766));
        phoneBook.addContact(new Contact("Никулин Юрий Петрович", 2453099));
        phoneBook.addContact(new Contact("Никулин Юрий Петрович", 2346788));
        phoneBook.addContact(new Contact("Мулюкина Майя Алексеевна", 2457777));

        phoneBook.printContact();

        phoneBook.find("Мулюкин Алексей Владимирович");
        phoneBook.find("Никулин Юрий Петрович");
        System.out.println();
        phoneBook.containsPhoneNumber(2457777);
    }
}
