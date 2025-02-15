package ru.otus.java.basic.homework5;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.type = "Собака";
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
        this.fatigueRate = 2;
    }
}
