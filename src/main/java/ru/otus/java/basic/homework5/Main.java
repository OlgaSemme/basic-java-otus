package ru.otus.java.basic.homework5;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Jetty", 1, 1, 30
        );
        System.out.println(dog.run(15));
        System.out.println(dog.swim(15));
        dog.info();
        Cat cat = new Cat("Catty", 2, 20);
        System.out.println(cat.run(15));
        cat.info();
        Horse horse = new Horse("Betty", 2, 2,100);
        System.out.println(horse.run(16));
        System.out.println(horse.swim(16));
        horse.info();
    }
}
