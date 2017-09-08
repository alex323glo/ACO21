package ua.artcode.week2.day1.model;

/**
 * Created by Alexey_O on 07.09.2017.
 */
public class Worker {

    // Fields, properties:
    private int id;
    private String name;
    private double salary;
    private  String phone;

    // Constructors:
    public Worker() {
        System.out.println("Worker constructor!");
    }

    public Worker(int id, String name, double salary, String phone) {
        System.out.println("Worker advanced constructor!");
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
    }

    // Getters and setters:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Other methods:
    public void work() {
        System.out.println("Worker works.");
    }

    public Worker getOwnSelf() {
        return this;
    }

}
