package ua.artcode.week1.day2.model;

/**
 * Created by Alexey_O on 05.09.2017.
 */
public class Student {

    // Fields, properties:
    private String name = "none";
    private String phone = "none";
    private String email = "none";

    private MyDate date = new MyDate();

    private double paidMoney = 0.0d;

//    private String city = "none";
//    private String street = "none";
//    private String houseNum = "none";
    private MyAddress address = new MyAddress();

    private int taskCount = 0;

    // Constructors:
    public Student() {
        System.out.println("Default constructor.");
    }

    public Student(String name, String phone, double paidMoney, String city, String street, String houseNum) {
        System.out.println("Overloaded constructor(1).");
        this.name = (name == null) ? "none" : name;
        this.phone = (phone == null) ? "none" : phone;
        this.paidMoney = (paidMoney < 0) ? 0 : paidMoney;
        address.setCity(city);
        address.setStreet(street);
        address.setHouseNum(houseNum);
    }

    public Student(String name, String phone, String email, double paidMoney, int taskCount, MyDate date, MyAddress address) {
        System.out.println("Overloaded constructor(2).");
        this.name = (name == null) ? "none" : name;
        this.phone = (phone == null) ? "none" : phone;
        this.email = (email == null) ? "none" : email;
        this.paidMoney = (paidMoney < 0) ? 0 : paidMoney;
        this.taskCount = (taskCount < 0) ? 0 : taskCount;
        if (date != null) this.date = date;
        if (address != null) this.address = address;
    }

    // Override methods:
    @Override
    public String toString() {
        return String.format("name: %s; \nphone: %s; \npaidMoney: %f; \nbirthDate: %d.%d.%d.",
                name, phone, paidMoney, date.getYear(), date.getMonth(), date.getDay());
    }

    // Getters and setters:

    public String getDate() {
        return String.format("%d.%d.%d",
                date.getYear(),
                date.getMonth(),
                date.getDay());
    }

    public String getAddress() {
        return String.format("%s, %s, %s",
                address.getCity(),
                address.getStreet(),
                address.getHouseNum());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
    }


    // Other methods:
    public void init(String name, String phone, double paidMoney, int birthYear, int birthMonth, int birthDay) {
        if (name != null) this.name = name;
        if (phone != null) this.phone = phone;
        this.paidMoney = paidMoney;
        this.date.setMyDate(birthYear, birthMonth, birthDay);
    }
}
