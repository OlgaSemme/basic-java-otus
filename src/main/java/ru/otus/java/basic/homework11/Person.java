package ru.otus.java.basic.homework11;

import static ru.otus.java.basic.homework11.Position.*;

public class Person {
    String name;
    ru.otus.java.basic.homework11.Position position;
    Long id;

    public Person(Long id, ru.otus.java.basic.homework11.Position position, String name) {
        this.id = id;
        this.position = position;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public boolean isManager() {
        if (position == MANAGER || position == DIRECTOR || position == BRANCH_DIRECTOR || position == SENIOR_MANAGER) {
            return true;
        }
        return false;
    }
}
