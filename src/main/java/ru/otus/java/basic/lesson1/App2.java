package ru.otus.java.basic.lesson1;

import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        linesNumber(10, "hello");
        arraySum(new int[]{6, 7, 9, 1, 5, 7, 9});
        int[] arr1 = new int[10];
        fillArrayWithArgs(5, arr1);
        int[] arr2 = {1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4};
        changeArray(5, arr2);
        compareHalf(new int[]{1, 1, 1, 6, 7, 9});
    }

    public static void linesNumber(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    public static void arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("sum=" + sum);
    }

    public static void fillArrayWithArgs(int w, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = w;
        }
        System.out.println("arr=" + Arrays.toString(array));
    }

    public static void changeArray(int x, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + x;
        }
        System.out.println("arr=" + Arrays.toString(array));
    }

    private static void compareHalf(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }
        if (sum1 > sum2) {
            System.out.println("Сумма элементов левой половины массива больше.");
        } else if (sum1 == sum2) {
            System.out.println("Сумма элементов половин массива равны.");
        } else {
            System.out.println("Сумма элементов правой половины массива больше.");
        }
    }
}
