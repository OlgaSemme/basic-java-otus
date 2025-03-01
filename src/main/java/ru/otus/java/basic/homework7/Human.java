package ru.otus.java.basic.homework7;

public class Human {
    private String name;
    private Transport currentTransport;
    private NoTransport feet;

    public Human(String name) {
        this.name = name;
        this.feet = new NoTransport();
        this.currentTransport = feet;
    }

    public boolean enter(Transport transport) {
        if (currentTransport instanceof NoTransport) {
            if (transport instanceof NoTransport) {
                System.out.println(name + " продолжает идти пешком");
            } else {
                System.out.println(name + " сел на " + transport.report());
                currentTransport = transport;
            }
            return true;
        }
        System.out.println("Сойдите с предыдущего транспорта");
        return false;
    }

    public boolean exit() {
        if (currentTransport instanceof NoTransport) {
            System.out.println(name + " продолжает идти пешком");
        } else {
            System.out.println(name + " покинул " + currentTransport.report());
            currentTransport = feet;
        }
        return true;
    }

    public boolean travel(int distance, Environment where) {
        return currentTransport.travel(distance, where);
    }
}





