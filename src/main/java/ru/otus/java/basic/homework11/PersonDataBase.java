package ru.otus.java.basic.homework11;

import java.util.*;

import static ru.otus.java.basic.homework11.Position.*;

public class PersonDataBase {
    Person foundPerson;
    ArrayList<Person> base = new ArrayList<>();
    HashMap<Long, Person> personMap = new HashMap<>();
    HashMap<Position, Boolean> isManagerMap = new HashMap<>();


    public PersonDataBase(ArrayList<Person> base) {
        this.base = base;
        for (int i = 0; i < base.size(); i++) {
            Person person = base.get(i);
            personMap.put(person.getId(), person);
        }

        isManagerMap.put(MANAGER, true);
        isManagerMap.put(DIRECTOR, true);
        isManagerMap.put(BRANCH_DIRECTOR, true);
        isManagerMap.put(SENIOR_MANAGER, true);

    }

    public Person findById(Long id) {
        foundPerson = personMap.get(id);
        if (foundPerson == null) {
            System.out.println("Сотрудник" + id + " отсутствует.");
        }
        return foundPerson;
    }

    public void add(Person person) {
        personMap.put(person.getId(), person);

    }


    public boolean isManager(Person person) {
        if (isManagerMap.get(person.getPosition()) != null) {
            return true;
        }
        return false;
    }


    public boolean isEmployee(Long id) {
        foundPerson = personMap.get(id);
        if (isManagerMap.get(foundPerson.getPosition()) != null ) {
            return false;
        }
        return true;
    }
  }
