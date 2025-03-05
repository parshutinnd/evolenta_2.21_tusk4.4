package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату в формате 'дд.мм.гггг': ");
        String inputDate = scanner.nextLine();

        String[] parce = inputDate.split("\\.");

        String formattedDate = parce[2] + "-" + parce[1] + "-" + parce[0];

        System.out.println(formattedDate);

        scanner.close();
    }
}