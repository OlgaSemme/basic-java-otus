package ru.otus.java.basic.homework5;

public class Horse extends Animal{
    public Horse(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.type = "Лошадка";
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
        this.fatigueRate = 4;
    }
}
