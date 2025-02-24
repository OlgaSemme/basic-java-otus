package ru.otus.java.basic.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public void catEats(Plate plate) {
        if (fullness) {
            System.out.println(name + " не хочет есть");
        } else {
            fullness = plate.eatFromPlate(appetite);
            if (fullness) {
                System.out.println(name + " поел и сыт");
            } else {
                System.out.println(name + " голоден - не хватило еды в тарелке");
            }
        }
    }
}
