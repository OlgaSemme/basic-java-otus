package ru.otus.java.basic.homework6;

public class Plate {

    private int maxVolume;
    private int currentVolume;

    public Plate(int maxVolume) {
        this.maxVolume = maxVolume;
        this.currentVolume = maxVolume;
    }

    public void addToPlate(int amount) {
       if (currentVolume + amount >= maxVolume) {
            System.out.println("Тарелка заполнена");
            currentVolume = maxVolume;
        } else {
            currentVolume += amount;
            System.out.println("В тарелке стало " + currentVolume + " еды");
        }
    }

    public boolean eatFromPlate(int amountEaten) {
        if (currentVolume >= amountEaten) {
            currentVolume -= amountEaten;
            return true;
        } else return false;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }
}

