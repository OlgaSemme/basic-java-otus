package ru.otus.java.basic.homework21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class APP {
    public static void main(String[] args) {
        ExecutorService serv = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            final int index = i;
            serv.execute(() -> {
                System.out.println("A");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            serv.execute(() -> {
                System.out.println("B");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            serv.execute(() -> {
                System.out.println("C");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });


        }
        serv.shutdown();
    }
}
