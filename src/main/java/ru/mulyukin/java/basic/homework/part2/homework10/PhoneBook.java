package ru.mulyukin.java.basic.homework.part2.homework10;

import java.util.*;

public class PhoneBook {
    private Map<Integer, String> record = new HashMap<>();


    public void addContact(Integer integer, Contact contact) {
        record.put(integer, String.valueOf(contact));
    }


    public void printContact() {
        for (Map.Entry<Integer, String> entry : record.entrySet()) {
            String value = entry.getValue();
            Integer key = entry.getKey();
            System.out.println("ФИО " + value + " , " + " телефон " + key);
        }
    }

    public void find(String firstName) {
        for (Map.Entry<Integer, String> entry : record.entrySet()) {
            String value = entry.getValue();
            Integer key = entry.getKey();
            if (value.equals(firstName)) {
                System.out.println("Номер контакта " + key);
            } else {
                System.out.println("Имя не верно ");
            }
        }
    }


    public void containsPhoneNumber(Integer phoneNumber) {
        System.out.println(record.containsKey(phoneNumber));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(record, phoneBook.record);
    }

    @Override
    public int hashCode() {
        return Objects.hash(record);
    }
}
