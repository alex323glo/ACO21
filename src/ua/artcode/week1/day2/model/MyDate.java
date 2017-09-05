package ua.artcode.week1.day2.model;

/**
 * Created by Alexey_O on 05.09.2017.
 */
public class MyDate {

    // Fields, properties:
    private int year = 1900;
    private int month = 1;
    private int day = 1;

    // Constructors:
    public MyDate() {

    }

    public MyDate(int year, int month, int day) {
        this.year = (year < 1) ? 1900 : year;
        this.month = (month < 1 || month > 12) ? 1 : month;
        this.day = (day < 1 || day > getMonthLenght(this.year, this.month)) ? 1 : day;
    }

    // Methods:
    private int getMonthLenght(int year, int month) {
        switch (month) {
            case 2:
                return (year % 4 == 0) ? 29 : 28;

            case 4:;
            case 6:;
            case 9:;
            case 12:
                return 30;

            default:
                return 31;
        }
    }

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