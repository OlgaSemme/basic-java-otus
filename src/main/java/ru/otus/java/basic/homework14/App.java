package ru.otus.java.basic.homework14;

public class App {


    public static void main(String[] args) {

        method1();
        method2();
    }


    public static void method1() {
        double[] arr = new double[100000000];
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            double current = 1.0 * i;
            arr[i] = 1.14 * Math.cos(current) * Math.sin(current * 0.2) * Math.cos(current / 1.2);
            //System.out.print(arr[i]);
        }
        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;
        System.out.println("Время выполнения в мс -  " + timeElapsed);
    }

    public static void method2() {
        double[] arr = new double[100000000];
        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < arr.length / 4; i++) {
                double current = 1.0 * i;
                arr[i] = 1.14 * Math.cos(current) * Math.sin(current * 0.2) * Math.cos(current / 1.2);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = arr.length / 4; i <  arr.length / 2   ; i++) {
                double current = 1.0 * i;
                arr[i] = 1.14 * Math.cos(current) * Math.sin(current * 0.2) * Math.cos(current / 1.2);
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = arr.length / 2; i <  arr.length / 4 * 3; i++) {
                double current = 1.0 * i;
                arr[i] = 1.14 * Math.cos(current) * Math.sin(current * 0.2) * Math.cos(current / 1.2);
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = arr.length / 4 * 3; i < arr.length; i++) {
                double current = 1.0 * i;
                arr[i] = 1.14 * Math.cos(current) * Math.sin(current * 0.2) * Math.cos(current / 1.2);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;
        System.out.println(" Время выполнения в мс -  " + timeElapsed);
    }

}


//Домашнее задание
//Работа с многопоточностью
//Цель домашнего задания: научиться работать с многопоточностью в Java. Посмотреть как
//многопоточность позволяет ускорить выполнение задач.
//● Необходимо выполнить две реализации задачи заполнения массива
//Реализация №1:
//● Реализуйте метод, который создает double массив длиной 100_000_000 элементов
//● Метод должен должен циклом for пройти по каждому элементу и посчитать его значение по формуле:
//array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
//● Засеките время выполнения цикла и выведите его в консоль.
//Реализация №2:
//● Сделайте то же самое что и в реализации один, только чтобы массив заполняли 4 потока
//одновременно. То есть первый поток заполняет первую четверть массива, второй - вторую и т.д.







