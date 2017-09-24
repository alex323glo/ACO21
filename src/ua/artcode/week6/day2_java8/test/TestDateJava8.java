package ua.artcode.week6.day2_java8.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TestDateJava8 {

    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(1990, 12, 05);
        LocalDate localDate2 = LocalDate.now();

        System.out.println(localDate1 + "\n" + localDate2);

        localDate1.get(ChronoField.DAY_OF_MONTH);
        // ...
    }

}
