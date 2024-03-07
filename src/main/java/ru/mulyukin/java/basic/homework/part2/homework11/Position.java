package ru.mulyukin.java.basic.homework.part2.homework11;

public enum Position {
    MANAGER("Manager"),
    DIRECTOR("Director"),
    DRIVER("Driver"),
    ENGINEER("Engineer"),
    SENIOR_MANAGER("Senior_manager"),
    DEVELOPER("Developer"),
    QA("Qa"),
    JANITOR("Janitor"),
    PLUMBER("Plamber"),
    BRANCH_DIRECTOR("Branch_director"),
    JUNIOR_DEVELOPER("Junior_developer");

    private String position;

    Position(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Position{}";
    }
}
