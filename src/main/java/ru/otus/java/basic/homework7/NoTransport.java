package ru.otus.java.basic.homework7;

public class NoTransport implements Transport {

    public NoTransport() {
    }

    @Override
    public boolean travel(int distance, Environment where) {
        System.out.println("Путь был преодолен пешком");
        return true;
    }

    @Override
    public String report() {
        return " идет пешком";
    }
}




