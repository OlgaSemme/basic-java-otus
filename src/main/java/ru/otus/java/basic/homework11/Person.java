package ru.otus.java.basic.homework11;

public class Person {
    String name;
    Position position;
    Long id;

    public Person(Long id, Position position, String name) {
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

   }
