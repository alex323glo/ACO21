package ua.artcode.week2.day1.model;

/**
 * Created by Alexey_O on 07.09.2017.
 */
public class Tester extends Worker {

    // Fields and properties:
    private String type;

    // Constructors:
    public Tester() {
        System.out.println("Tester constructor!");
    }

    public Tester(int id, String name, double salary, String phone, String type) {
        super(id, name, salary, phone);
        System.out.println("Tester advanced constructor!");
        this.type = type;
    }

    // Getters and setters:
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    //Other methods:
    public void test() {
        System.out.println("Tester tests.");
    }

}
