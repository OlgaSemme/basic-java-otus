package ru.otus.java.basic.homework7;

public class Main {
    public static void main(String[] args) {
        Transport[] transport = {new Bicycle(),
                new Horse(30),
                new ATV(30),
                new Car(20),
                new NoTransport()};

        Human human = new Human("Bob");

        for (int i = 0; i < transport.length; i++) {
            human.exit();
            human.enter(transport[i]);
            human.travel(30, Environment.SWAMP);
        }
    }
}


