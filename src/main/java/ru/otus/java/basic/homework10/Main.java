package ru.otus.java.basic.homework10;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhones = new PhoneBook() ;

        myPhones.add("Иванова Ольга Ивановна", "89213568978");
        myPhones.add("Иванова Ольга Ивановна", "89213568979");
        myPhones.add("Иванова Ольга Ивановна", "89219728978");
        myPhones.add("Петрова Мария Степановна", "89219928978");
        System.out.println(myPhones.numbersAndNames.entrySet());
        myPhones.containsPhoneNumber("89213568978");
        myPhones.find("Иванов Петр Петрович");
    }
}
