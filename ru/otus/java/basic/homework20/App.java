package ru.otus.java.basic.homework20;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class App {
    public static void main(String[] args) {


        File rootDirectory = new File(".");
        for (File f : rootDirectory.listFiles()) {
            String fileName = f.getName();
            if (fileName.toLowerCase().endsWith(".txt")) {
                System.out.printf("%-20s %-5d bytes\n", fileName, f.length());
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла");
        String fileName = scanner.nextLine();
        System.out.println("Введите последовательность символов");
        String symbols = scanner.nextLine();


        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

            int count = 0;
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileInputStream.read(buffer)) != -1) {
                String data = new String(buffer, 0, length, StandardCharsets.UTF_8);

                Pattern pattern = Pattern.compile(Pattern.quote(symbols));
                Matcher matcher = pattern.matcher(data);
                while (matcher.find()) {
                    count++;
                }
                System.out.println("Количество заданных сочетаний символов в файле - " + count);


            }
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
      
