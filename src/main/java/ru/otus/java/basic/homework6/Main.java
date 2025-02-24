package ru.otus.java.basic.homework6;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(20);
        Cat[] cats = {new Cat("Рыжик", 1),
                new Cat("Барсик", 5),
                new Cat("Пушок", 4),
                new Cat("Васька", 6)
        };
        for (int i = 0; i < cats.length; i++) {
            if (plate.getMaxVolume() < 0 || cats[i].getAppetite() < 0) {
                System.out.println("Задано отрицательное значение объема тарелки или аппетита");
                break;
            }
            cats[i].catEats(plate);
        }
        System.out.println("В тарелке " + plate.getCurrentVolume() + " еды");
        plate.addToPlate(6);
    }
}