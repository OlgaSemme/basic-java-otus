package ru.otus.java.basic.homework7;

public class ATV implements Transport {
    private int petrolAmount;


    public ATV(int petrolAmount) {
        this.petrolAmount = petrolAmount;
    }

    public boolean travel(int distance, Environment where) {
        if (distance * 3 > petrolAmount) {
            System.out.println("У вездехода не хватит топлива.");
            return false;
        }
        petrolAmount -= (distance * 3);
        System.out.println("Путешествие на вездеходе удалось!");
        return true;
    }

    @Override
    public String report() {
        return "вездеход";
    }

}
