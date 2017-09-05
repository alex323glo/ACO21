package ua.artcode.week1.day1.model;

/**
 * Created by Alexey_O on 04.09.2017.
 */
public class Student {

    // fields, properties
    private String name = "none";
    private String phone = "none";
    private String email = "none";

    private MyDate myDate = new MyDate();

    private double paidMoney = 0.0d;

    private String city = "none";
    private String street = "none";
    private String houseNum = "none";

    private int taskCount = 0;

    @Override
    public String toString() {
        return String.format("name: %s; \nphone: %s; \npaidMoney: %f; \nbirthDate: %d.%d.%d.",
                name, phone, paidMoney, myDate.getYear(), myDate.getMonth(), myDate.getDay());
    }

    public void init(String name, String phone, double paidMoney, int birthYear, int birthMonth, int birthDay) {
        if (name != null) this.name = name;
        if (phone != null) this.phone = phone;
        this.paidMoney = paidMoney;
        this.myDate.setMyDate(birthYear, birthMonth, birthDay);
    }

    public String getDate() {
        return String.format("%d.%d.%d",
                myDate.getYear(),
                myDate.getMonth(),
                myDate.getDay());
    }

    public String getName() {
        return name;
    }
}
