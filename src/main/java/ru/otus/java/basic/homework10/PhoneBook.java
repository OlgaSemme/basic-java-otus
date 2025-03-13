package ru.otus.java.basic.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    public PhoneBook() {
    }

    HashMap<String, String> numbersAndNames = new HashMap<>();

    public void add(String number, String name) {

        if (numbersAndNames.containsKey(number)) {
            System.out.println("Номер телефона " + number + " уже есть в справочнике.");
        } else {
            numbersAndNames.put(number, name);
            System.out.println("Номер телефона добавлен.");
        }
    }

    public void containsPhoneNumber(String number) {
        if (numbersAndNames.containsKey(number)) {
            System.out.println("Номер телефона " + number + " есть в справочнике.");
        }
    }


    public void find(String name) {
        List<String> list = new ArrayList<>();
        for (HashMap.Entry<String, String> entry : numbersAndNames.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (value.equals(name)) {
                list.add(key);
            }
        }
        System.out.println("Номера телефонов для " + name + ":" + list);
    }
}




