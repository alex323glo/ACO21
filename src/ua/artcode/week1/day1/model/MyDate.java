package ua.artcode.week1.day1.model;

/**
 * Created by Alexey_O on 04.09.2017.
 */
public class MyDate {

    private int year = 1900;
    private int month = 11;
    private int day = 1;

    public void setMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}