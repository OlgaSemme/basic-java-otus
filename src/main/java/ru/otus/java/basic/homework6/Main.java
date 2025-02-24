package ru.otus.java.basic.homework6;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(20);
        Cat[] cats = {new Cat("Рыжик", 1),
                new Cat("Барсик", -5),
                new Cat("Пушок", -4),
                new Cat("Васька", 6)
        };
        if (plate.getMaxVolume() < 0) {
            System.out.println("Задано отрицательное значение объема тарелки");
            return;
        }
        for (int i = 0; i < cats.length; i++) {
            if ( cats[i].getAppetite() < 0) {
                System.out.println("Задано отрицательное значение аппетита для кота " + cats[i].getName());
                continue;
            }
            cats[i].catEats(plate);
        }
        System.out.println("В тарелке " + plate.getCurrentVolume() + " еды");
        plate.addToPlate(6);
    }
}