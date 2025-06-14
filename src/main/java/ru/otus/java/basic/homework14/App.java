package ru.otus.java.basic.homework14;

public class App {


    public static void main(String[] args) throws InterruptedException {

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

    public static void method2() throws InterruptedException {
        double[] arr = new double[100000000];
        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < arr.length / 4; i++) {
                double current = 1.0 * i;
                arr[i] = 1.14 * Math.cos(current) * Math.sin(current * 0.2) * Math.cos(current / 1.2);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = arr.length / 4; i < arr.length / 2; i++) {
                double current = 1.0 * i;
                arr[i] = 1.14 * Math.cos(current) * Math.sin(current * 0.2) * Math.cos(current / 1.2);
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = arr.length / 2; i < arr.length / 4 * 3; i++) {
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
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;
        System.out.println(" Время выполнения в мс -  " + timeElapsed);
    }

}










