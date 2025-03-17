package ru.otus.java.basic.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    List foundValue;

    public PhoneBook() {
    }

    HashMap<String, List> numbersAndNames = new HashMap<>();

    public void add(String name, String number) {
        for (HashMap.Entry<String, List> entry : numbersAndNames.entrySet()) {
            List<String> value = entry.getValue();
            for (String num : value) {
                if (num.equals(number)) {
                    System.out.println("Номер телефона " + number + " уже есть в справочнике.");
                    return;
                }
            }
        }
        foundValue = numbersAndNames.get(name);
        if (foundValue != null) {
            foundValue.add(number);
        } else {
            List<String> newList = new ArrayList<>();
            newList.add(number);
            numbersAndNames.put(name, newList);
            System.out.println("Номер телефона добавлен.");
        }
    }

    public void containsPhoneNumber(String number) {
        for (HashMap.Entry<String, List> entry : numbersAndNames.entrySet()) {
            List<String> value = entry.getValue();
            for (String num : value) {
                if (num.equals(number)) {
                    System.out.println("Номер телефона " + number + " есть в справочнике.");
                    return;
                }
            }
        }
        System.out.println("Номера телефона " + number + " нет в справочнике.");
    }


    public void find(String name) {
        foundValue = numbersAndNames.get(name);
        if (foundValue == null) {
            System.out.println("Номера телефонов для " + name + " отсутствуют.");
        } else
            System.out.println("Номера телефонов для " + name + ":" + numbersAndNames.get(name));
    }
}