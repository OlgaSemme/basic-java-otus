package ru.otus.java.basic.homework7;

public class Car implements Transport {
    private int petrolAmount;


    public Car(int petrolAmount) {
        this.petrolAmount = petrolAmount;
    }


    public boolean travel(int distance, Environment where) {
        if (where == Environment.SWAMP || where == Environment.FOREST) {
            System.out.println("Автомобиль не может здесь проехать.");
            return false;
        }
        if (distance * 2 > petrolAmount) {
            System.out.println("У aвтомобиля не хватит топлива");
            return false;
        }
        petrolAmount -= (distance*2);
        System.out.println("Путешествие на автомобиле удалось!");
        return true;
    }

    @Override
    public String report() {
        return "aвтомобиль";
    }

}
