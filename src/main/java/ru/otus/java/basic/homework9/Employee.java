package ru.otus.java.basic.homework9;

public class Employee {
    private String name;
    private int age;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
