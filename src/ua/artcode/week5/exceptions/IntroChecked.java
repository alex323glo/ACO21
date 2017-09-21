package ua.artcode.week5.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IntroChecked {

    public static void main(String[] args)/* throws ParseException */{
        // 1992-20-03 -> Date (see java 8)
        // Date (millis - time from 1970 to present days)
        System.currentTimeMillis();
        Date point = new Date();
        long millis = point.getTime();

        // Date <-> String

        Date date = null;
        try {
            date = myMethod("1990-A3-12");
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("You got default date.");
            date = new Date();
        }
    }

    public static Date myMethod(String strDate) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-mm-dd");
        Date date = simpleDateFormat.parse(strDate);
        System.out.println("after parse");
        return date;

    }

}
