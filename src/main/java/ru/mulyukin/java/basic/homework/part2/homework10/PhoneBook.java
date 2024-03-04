package ru.mulyukin.java.basic.homework.part2.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<Integer, List<Contact>> record = new HashMap<>();


    public void addContact(Integer integer, Contact contact) {
        record.computeIfAbsent(integer, k -> new ArrayList<>()).add((contact));

    }


    public void printContact() {
        for (Map.Entry<Integer, List<Contact>> entry : record.entrySet()) {
            String value = entry.getValue().toString();
            Integer key = entry.getKey();
            System.out.println("ФИО " + value + " , " + " телефон " + key);
        }
    }

    public void find(String firstName) {
        for (Map.Entry<Integer, List<Contact>> elem : record.entrySet()) {
            String value = elem.getValue().toString();
            Integer key = elem.getKey();
            if (value.contains(firstName)) {
                System.out.println("Номер абонента " + key);
            }
        }
    }


    public void containsPhoneNumber(Integer phoneNumber) {
        System.out.println(record.containsKey(phoneNumber));
    }

}


