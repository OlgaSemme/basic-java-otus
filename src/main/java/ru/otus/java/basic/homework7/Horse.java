package ru.otus.java.basic.homework7;

public class Horse implements Transport {
    private int stamina;

    public Horse(int stamina) {
        if (stamina <= 0) {
            System.out.println("Выносливость должна быть положительной!");
        }
        this.stamina = stamina;
    }

    public boolean travel(int distance, Environment where) {
        if (where == Environment.SWAMP) {
            System.out.println("Лошадь не может здесь проехать.");
            return false;
        }
        if (distance*2 > stamina) {
            System.out.println("У лошади не хватает сил для поездки.");
            return false;
        }
        stamina -= (distance*2);
        System.out.println("Путешествие на лошади удалось!");
        return true;
    }

    @Override
    public String report() {
        return "лошадь";
    }
}

