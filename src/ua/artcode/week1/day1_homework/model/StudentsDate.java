package ua.artcode.week1.day1_homework.model;

/**
 * Created by Alexey_O on 04.09.2017.
 */
public class StudentsDate {

    private int year = 1900;
    private int month = 11;
    private int day = 1;

    private int getCurrentMonthSize() {
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

    public boolean setDate(int year, int month, int day) {
        if (year < 0 || (month < 1 || month > 12) || (day < 1 || day > getCurrentMonthSize())) {
            return false;
        }
        this.year = year;
        this.month = month;
        this.day = day;
        return true;
    }

    public String getDate() {
        return String.format("%d.%d.%d", year, month, day);
    }
}
