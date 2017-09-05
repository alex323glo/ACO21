package ua.artcode.week1.day2.util;

import ua.artcode.week1.day2.model.MyAddress;
import ua.artcode.week1.day2.model.MyDate;
import ua.artcode.week1.day2.model.Student;

/**
 * Created by Alexey_O on 05.09.2017.
 */
public class StudentUtils {

    public static Student generateStudent() {
        String name = generateName();
        String phone = generatePhone();
        String email = generateEmail();
        double paidMoney = generatePaidMoney();
        int taskCount = generateTaskCount();
        MyDate date = generateDate();
        MyAddress address = generateAddress();
        Student tempStudent = new Student(name, phone, email, paidMoney, taskCount, date, address);
        return tempStudent;
//        return new Student(generateName(),
//                generatePhone(),
//                generateEmail(),
//                generatePaidMoney(),
//                generateTaskCount(),
//                generateDate(),
//                generateAddress());
    }

    private static MyAddress generateAddress() {
        return new MyAddress("Kiev", "Central str.", "1a");
    }

    private static MyDate generateDate() {
        return new MyDate(NumberTools.generateNumber(1980, 2000),
                NumberTools.generateNumber(1, 12),
                NumberTools.generateNumber(1, 28));
    }

    private static int generateTaskCount() {
        return NumberTools.generateNumber(0, 20);
    }

    private static double generatePaidMoney() {
        return NumberTools.generateNumber(2000.0, 10_000.0, -1);
    }

    private static String generateEmail() {
        return "some_email@gmail.com";
    }

    private static String generatePhone() {
        String phoneStr = "+380";
        for (int i = 0; i < 9; i++) {
            phoneStr += "" + (int)(Math.random() * 10);
        }
        return phoneStr;
    }

    private static String generateName() {
        String[] names = {
                "Andrey", "Oleg", "Sergiy", "Olexiy",
                "Bogdan", "Yura", "Ivan", "Kolia"};
        return names[(int)(Math.random() * names.length)];
    }

}
