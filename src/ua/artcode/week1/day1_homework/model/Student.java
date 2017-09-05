package ua.artcode.week1.day1_homework.model;

/**
 * Created by Alexey_O on 04.09.2017.
 */
public class Student {
    private int id;

    private String name = "none";
    private String phone = "none";
    private String email = "none";

    private double paidMoney = 0.0d;

    private int taskCount = 0;

    private StudentsDate date = new StudentsDate();

    private StudentsAddress address = new StudentsAddress();

    public Student(int id) {
        this.id = id;
    }

    public boolean setName(String name) {
        if (name == null || name.length() < 1) return false;
        this.name = name;
        return true;
    }

    public boolean setPhoneNumber(String phone) {
        if (phone.length() < 1 || phone.length() > 13) return false;
        this.phone = phone;
        return true;
    }

    public boolean setEmail(String email) {
        if (email == null || email.length() < 1 || email.indexOf((int)'@') == -1) return false;
        this.email = email;
        return true;
    }

    public boolean setDate(int year, int month, int day) {
        if (!date.setDate(year, month, day)) {
            return false;
        }
        return true;
    }

    public boolean setAddress(String city, String street, String number) {
        if (!address.setAddress(city, street, number)) {
            return false;
        }
        return true;
    }

    public boolean setSalary(double paidMoney) {
        if (paidMoney < 0) return false;
        this.paidMoney = paidMoney;
        return true;
    }

    public boolean setTaskCount(int taskCount) {
        if (taskCount < 0) return false;
        this.taskCount = taskCount;
        return true;
    }

    public int getId() {
        return id;
    }

    public String getQuickInfo() {
        return String.format("%d %s", id, name);
    }

    public String getWholeInfo() {
        return String.format(
                "ID: %d\nName: %s\nPhone: %s\nEmail: %s\nPaid money: %.2f\nTask count: %d\nDate: %s\nAddress: %s",
                id, name, phone, email, paidMoney, taskCount, date.getDate(), address.getAddress());
    }
}
