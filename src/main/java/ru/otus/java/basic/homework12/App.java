package ru.otus.java.basic.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        File file = new File(".");
        for (File f : file.listFiles()) {
            String fileName = f.getName();
            if (fileName.toLowerCase().endsWith(".txt")) {
                System.out.printf("%-20s %-5d bytes\n", fileName, f.length());
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла");
        String fileName = scanner.nextLine();
        File newFile = new File(fileName);
        if (newFile.exists()) {
            try (FileInputStream in = new FileInputStream(fileName)) {
                byte[] buf = new byte[8192];
                int n = in.read(buf);
                do {
                    System.out.print(new String(buf, 0, n));
                    n = in.read(buf);
                } while (n > 0);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Scanner newScanner = new Scanner(System.in);
            System.out.println(" \n" + "Введите строку для записи в файл");
            String newString = " \n" + scanner.nextLine();
            try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newFile, true))) {
                out.write(newString.getBytes(StandardCharsets.UTF_8));

            } catch (IOException e) {
                e.printStackTrace();
            }
            try (FileInputStream in = new FileInputStream(fileName)) {
                byte[] buf = new byte[8192];
                int n = in.read(buf);
                do {
                    System.out.print(new String(buf, 0, n));
                    n = in.read(buf);
                } while (n > 0);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Такой файл отсутствует");
            main(args);
        }
    }
}

