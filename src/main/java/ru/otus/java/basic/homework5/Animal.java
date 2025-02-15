package ru.otus.java.basic.homework5;

public class Animal {
    String name;
    String type;
    int runSpeed;
    int swimSpeed;
    int endurance;
    int fatigueRate;

    public int getEndurance() {
        return endurance;
    }

    public String getName() {
        return name;
    }

    public int getFatigueRate() {
        return fatigueRate;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public int run(int distance) {
        int t = distance / runSpeed;
        if (distance > endurance) {
            //endurance = 0;
            System.out.println(type + " " + name + " пробежала " + (distance - endurance) + " метров и устал");
            return -1;
        } else {
            endurance -= distance;
            System.out.println(type + " " + name + " пробежала за время " + t);
            return t;
        }
    }

    public int swim(int distance) {
        int t = distance / swimSpeed;
        if (distance * fatigueRate >= endurance) {
            endurance = 0;
            System.out.println(type + " " + name + " проплыла " + (distance - endurance) + " метров и устал");
            return -1;
        } else {
            endurance -= distance * fatigueRate;
            System.out.println(type + " " + name + " проплыла за время " + t);
            return t;
        }
    }

    public void info() {
        if (endurance == 0) {
            System.out.println(type + " " + name + " устала ");
        } else
            System.out.println(type + " " + name + " имеет " + endurance + " единиц выносливости");
    }
}