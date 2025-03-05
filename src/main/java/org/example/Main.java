package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату в формате 'дд.мм.гггг': ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(inputDate, inputFormat);

        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(outputFormat);

        System.out.println(formattedDate);

        scanner.close();
    }
}