package ru.mulyukin.java.basic.homework.part2.homework11;

import java.util.Objects;

public class Person {
    private String firstName;
    private String LastName;
    private Position position;

    public Person(String firstName, String lastName, Position position) {
        this.firstName = firstName;
        LastName = lastName;
        this.position = position;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(LastName, person.LastName) && position == person.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, LastName, position);
    }
}
