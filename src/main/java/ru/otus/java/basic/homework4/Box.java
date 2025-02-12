package ru.otus.java.basic.homework4;

public class Box {
    private int leng;
    private int width;
    private int height;
    private String color;
    private boolean empty;
    private boolean open;

    public Box(int leng, int width, int height, String color) {
        this.leng = leng;
        this.width = width;
        this.height = height;
        this.color = color;
        this.empty = true;
        this.open = false;
    }

    public void boxInfo() {
        System.out.println("Длина*Ширина*Высота: " + leng + "*" + width + "*" + height);
        System.out.println("Цвет: " + color);
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void open() {
        System.out.println("Коробка открыта");
        open = true;
    }

    public void close() {
        System.out.println("Коробка закрыта");
        open = false;
    }

    public void fill() {
        if (!open) {
            System.out.println("Откройте коробку");
        } else {
            System.out.println("Предмет в коробке");
            empty = false;
        }

    }

    public void extract() {
        if (!open) {
            System.out.println("Откройте коробку");
        } else if (empty) {
            System.out.println("Предмета нет");
        } else {
            System.out.println("Предмет извлечен");
            empty = true;
        }
    }
}