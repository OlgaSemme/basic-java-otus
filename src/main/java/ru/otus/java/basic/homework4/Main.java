package ru.otus.java.basic.homework4;

public class Main {
    public static void main(String[] args) {
        User[] Users = {
                new User("Иванова", "Мария", "Петровна", 1981, "ivanova@mail.ru"),
                new User("Иванов", "Сергей", "Борисович", 1978, "ivanov@mail.ru"),
                new User("Петров", "Алексей", "Иванович", 1988, "petrov@mail.ru"),
                new User("Алексеев", "Иван", "Сергеевич", 1989, "alekseev@mail.ru"),
                new User("Романов", "Петр", "Алексеевич", 1969, "romanov@mail.ru"),
                new User("Сергеев", "Александр", "Иванович", 1999, "sergeev@mail.ru"),
                new User("Алексеева", "Ирина", "Ивановна", 1979, "alekseeva@mail.ru"),
                new User("Романова", "Вера", "Александровна", 1985, "romanova@mail.ru"),
                new User("Сергеева", "Екатерина", "Петровна", 1983, "sergeeva@mail.ru"),
                new User("Петрова", "Марина", "Сергеевна", 1994, "petrova@mail.ru")
        };
        for (int i = 0; i < Users.length; i++) {
            if (Users[i].getYear() <= 1985) {
                Users[i].userInfo();
            }
        }


      Box box = new Box(4,5,9, "black");
        box.setColor("green");
        box.open();
        box.fill();
        box.extract();
        box.boxInfo();
    }
}
