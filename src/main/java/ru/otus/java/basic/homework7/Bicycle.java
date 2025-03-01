package ru.otus.java.basic.homework7;

public class Bicycle implements Transport {
    public Bicycle() {
    }

    public boolean travel(int distance, Environment where) {
        if (where == Environment.SWAMP) {
            System.out.println("Велосипед не может здесь проехать");
            return false;
        }
        System.out.println("Путешествие на велосипеде удалось!");
        return true;
    }

    @Override
    public String report() {
        return "велосипед";
    }

}