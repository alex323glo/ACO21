package ua.artcode.week6.day1.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDateJava7 {

    public static void main(String[] args) {
        // JodaTime -> Java 8

        Date date = new Date();
        System.out.println(date.getTime());

        System.out.println(date);


        String string = String.format("year %1$tY, month %1$tm, day %1$td, time %1$tH:%1$tM", date);
        System.out.println(string);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println(format.parse("1990-12-05"));
        } catch (ParseException e) {
            System.out.println("Can't parse String to date! Trace: " + e.getStackTrace());
        }


        Calendar calendar = new GregorianCalendar(1, 11, 12);
        int month = calendar.get(Calendar.MONTH);

        Date fromCalendar = calendar.getTime();

        calendar.setTime(date);
    }

}
