package ru.otus.java.basic.homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import static ru.otus.java.basic.homework11.Position.*;

public class PersonDataBase {
    Person foundPerson;
    ArrayList<Person> base = new ArrayList<>();
    HashMap<Long, Person> personMap = new HashMap<>();

    public PersonDataBase(ArrayList<Person> base) {
        this.base = base;
        for (int i = 0; i < base.size(); i++) {
            Person person = base.get(i);
            personMap.put(person.getId(), person);
        }
    }


    public Person findById(Long id) {
        for (int i = 0; i < base.size(); i++) {
            Person test = base.get(i);
            if (Objects.equals(test.getId(), id)) {
                return test;
            }
        }
        return null;
    }

    public Person findByIdMap(Long id) {
        foundPerson = personMap.get(id);
        if (foundPerson == null) {
            System.out.println("Сотрудник" + id + " отсутствует.");
        }
        return foundPerson;
    }

    public void add(Person person) {

        base.add(person);
        personMap.put(person.getId(), person);

    }


    public boolean isManager(Person person) {
        if (person.getPosition() == MANAGER || person.getPosition() == DIRECTOR || person.getPosition() == BRANCH_DIRECTOR || person.getPosition() == SENIOR_MANAGER) {
            return true;
        }
        return false;
    }

    public boolean isEmployee(Long id) {
        for (int i = 0; i < base.size(); i++) {
            Person test = base.get(i);
            if (Objects.equals(test.getId(), id)) {
                if (test.getPosition() != MANAGER || test.getPosition() != DIRECTOR || test.getPosition() != BRANCH_DIRECTOR || test.getPosition() != SENIOR_MANAGER) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEmployeeMap(Long id) {
        foundPerson = personMap.get(id);
        if (foundPerson.getPosition() != MANAGER || foundPerson.getPosition() != DIRECTOR || foundPerson.getPosition() != BRANCH_DIRECTOR || foundPerson.getPosition() != SENIOR_MANAGER) {
            return true;
        }
        return false;
    }
}