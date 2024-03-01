package ru.mulyukin.java.basic.homework.part2.homework10;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<Integer, String> phoneBook = new HashMap<>();

    public PhoneBook() {
        this.phoneBook = phoneBook;
    }

    public void addContact(Contact contact) {
        phoneBook.put(contact.getPhoneNumber(), contact.getFullName());
    }

    public void printContact() {
        System.out.println(phoneBook);
    }

    public void find(String fullName) {
        for (Map.Entry<Integer, String> entry : phoneBook.entrySet()) {
            String value = entry.getValue();
            Integer key = entry.getKey();
            if (value.equals(fullName)) {
                System.out.println("Номер контакта " + key);
            }
        }
    }

    public boolean containsPhoneNumber(Integer phoneNumber) {
        System.out.println(phoneBook.containsKey(phoneNumber));
        return true;
    }
}
