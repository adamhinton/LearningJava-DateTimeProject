package dev.lpa;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        // yyyy-mm-dd
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate Five5 = LocalDate.of(2022, 5, 5);
        System.out.println(Five5);

        // enums for month, cool
        LocalDate May5th = LocalDate.of(2022, Month.MAY, 5);
        System.out.println(May5th);

        LocalDate Day125 = LocalDate.ofYearDay(2022, 125);
        System.out.println(Day125);

    }
}