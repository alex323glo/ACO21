package ua.artcode.week2.day1.model;

/**
 * Created by Alexey_O on 07.09.2017.
 */
public class Coder extends Worker {     // is-a

    // Fields and properties:
    private String programmingLanguage;

    // Constructors:
    public Coder() {
        System.out.println("Coder constructor!");
    }

    public Coder(int id, String name, double salary, String phone, String programmingLanguage) {
        super(id, name, salary, phone); // Must be called AT THE BEGINNING of the constructor!!!
        System.out.println("Coder advanced constructor!");
        this.programmingLanguage = programmingLanguage;
    }

    // Getters and setters:
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    // Other methods:
    public void code() {
        System.out.println("Coder codes.");
    }
}
