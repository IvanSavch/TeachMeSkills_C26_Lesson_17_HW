package com.teachmeskills.lesson17.hw.task2;

import com.teachmeskills.lesson17.hw.task2.functional.DataFunctional;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Get day of week by date
 */
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter date.Format :dd-mm-yyyy");
        String inputDate = scanner.nextLine();

        try {
           LocalDate localDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            DataFunctional dataFunctional = LocalDate::getDayOfWeek;
            DayOfWeek dayOfWeek = dataFunctional.day(localDate);
            System.out.println("Day of the week for " + dayOfWeek);
        }catch (DateTimeParseException e) {
            System.out.println("invalid date format");
        }catch (NullPointerException e) {
            System.out.println("wrong date");
        }
        

    }
}
