package ru.otus.java.basic.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        arrayMinMax(0, 4);
        System.out.println(arraySum(new ArrayList<>(Arrays.asList(1, 2, 9))));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8, 6, 7));
        arrayGhange(5, list);
        arrayIncrease(4, list);
        Employee bob = new Employee(23, "Bob");
        Employee jack = new Employee(28, "Jack");
        Employee john = new Employee(30, "John");
        Employee kate = new Employee(25, "Kate");
        ArrayList<Employee> workers = new ArrayList<>(Arrays.asList(bob, jack, john, kate));
        System.out.println(arrayName(workers));
        System.out.println(arrayMinAge(26, workers));
        arrayMiddleAge(28, workers);
        System.out.println(arrayYoungest(new ArrayList<>(Arrays.asList(bob, jack, john, kate))));
    }

    public static void arrayMinMax(int min, int max) {
        int length = max - min + 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(min);
            min += 1;
        }
        System.out.println(list);
    }


    public static int arraySum(ArrayList<Integer> list) {
        int sum = 0;
        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) > 5) {
        //         sum += list.get(i);
        for (int num : list) {
            if (num > 5) {
                sum += num;
            }
        }
        return sum;
    }

    public static void arrayGhange(int a, ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            list.set(i, a);
        }
        System.out.println(list);
    }


    public static void arrayIncrease(int a, ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + a);
        }
        System.out.println(list);
    }

    public static List arrayName(List<Employee> list) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            names.add(name);
        }
        return (names);
    }

    public static List<String> arrayMinAge(int minAge, List<Employee> list) {
        List<String> minAgeList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() >= minAge) {
                minAgeList.add(list.get(i).getName());
            }
        }
        return (minAgeList);
    }

    public static void arrayMiddleAge(int middleAge, ArrayList<Employee> list) {
        int calcMiddleAge = 0;
        for (int i = 0; i < list.size(); i++) {
            calcMiddleAge += list.get(i).getAge();
        }
        if (calcMiddleAge / list.size() > middleAge) {
            System.out.println("Cредний возраст сотрудников превышает указанный аргумент");
        } else
            System.out.println("Cредний возраст сотрудников не превышает указанный аргумент");
    }

    public static Employee arrayYoungest(ArrayList<Employee> list) {
        Employee youngest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getAge() < youngest.getAge()) {
                youngest = (list.get(i));
            }
        }
        return youngest;
    }
}


