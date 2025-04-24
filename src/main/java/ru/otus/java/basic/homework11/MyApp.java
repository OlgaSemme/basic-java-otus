package ru.otus.java.basic.homework11;

import java.util.ArrayList;
import java.util.Arrays;

import static ru.otus.java.basic.homework11.Position.*;

public class MyApp {
    public static void main(String[] args) {
        Person kate = new Person(23555L, MANAGER, "Kate Smith");
        Person bob = new Person(23535L, DIRECTOR, "Bob Smith");
        Person lily = new Person(27535L, ENGINEER, "Lily Jones");
        Person mark = new Person(97535L, PLUMBER, "Mark Jameson");
        PersonDataBase myBase = new PersonDataBase(new ArrayList<>(Arrays.asList(kate, bob, lily)));

        System.out.println(myBase.findById(23555L).getName());
        System.out.println(myBase.findByIdMap(23555L).getName());
        myBase.add(mark);
        System.out.println(myBase.findById(97535L).getName());
        System.out.println(myBase.isManager(lily));
        System.out.println(myBase.isEmployee(27535L));
        System.out.println(myBase.isEmployeeMap(27535L));
    }
}
