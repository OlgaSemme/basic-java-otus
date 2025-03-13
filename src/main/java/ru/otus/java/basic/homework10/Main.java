package ru.otus.java.basic.homework10;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhones = new PhoneBook() ;

        myPhones.add("79213456789", "Иванова Ольга Ивановна");
        myPhones.add("79213456689", "Иванова Ольга Ивановна");
        myPhones.add("792136456689", "Иванов Петр Петрович");
        myPhones.add("79213945689", "Иванова Ольга Ивановна");
        System.out.println(myPhones.numbersAndNames.entrySet());
        myPhones.containsPhoneNumber("79213456789");
        myPhones. find("Иванова Ольга Ивановна");
    }
}
