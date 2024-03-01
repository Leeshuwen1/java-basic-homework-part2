package ru.mulyukin.java.basic.homework.part2.homework10;

import java.util.Objects;

public class Contact {
    private String fullName;
    private Integer phoneNumber;

    public Contact(String fullName, Integer phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact phoneBook = (Contact) o;
        return Objects.equals(fullName, phoneBook.fullName) && Objects.equals(phoneNumber, phoneBook.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, phoneNumber);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
