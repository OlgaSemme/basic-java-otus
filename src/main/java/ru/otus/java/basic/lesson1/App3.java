package ru.otus.java.basic.lesson1;

import java.util.Arrays;

public class App3 {
    public static void main(String[] args) {
        System.out.println(sumOfPositiveElements(new int[][]{{6, -7}, {1, 5}, {9, 2}}));
        printOfSquare(10);
        int[][] myarr = new int[][]{{6, 7, 1, 8, 8}, {1, 5, 9, 10, 9}, {9, 2, 4, 1, 15}, {9, 2, 4, 1, 2}, {9, 2, 4, 1, 2}};
        diagToNull(myarr);
        int[][] myarr1 = new int[][]{{6, 7, 1, 8, 8}, {1, 5, 9, 10, 9}};
        System.out.println(findMax(myarr1));
        System.out.println(line1Sum(myarr1));
    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void printOfSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == 0 || i == (size - 1) || j == (size - 1)) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void diagToNull(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][i] = 0;
                arr[i][arr.length - i - 1] = 0;
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int findMax(int[][] arr) {
        int x = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > x) {
                    x = arr[i][j];
                }
            }
        }
        return x;

    }

    public static int line1Sum(int[][] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int sum = 0;
        int[] line1 = arr[1];
        for (int i = 0; i < line1.length; i++) {
            sum += line1[i];
        }
        return sum;

    }
}
