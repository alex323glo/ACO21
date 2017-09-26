package ua.artcode.week7.day1.model;

import java.util.Date;

public class User {

    private int id;
    private double salary;
    private String name;
    private Date birth;

    public User(int id, double salary, String name, Date birth) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    //      Main rule:
    //
    //                  x.equals(y)     ====>   x.hashCode() == y.hashCode() ,
    //
    //                                  BUT
    //
    //      x.hashCode == y.hashCode    ==x=>   x.equals(y)
    //
    //      !!!

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 31 * hash + id;  // ">>" operation
        hash = 31 * hash + (name != null ? name.hashCode() : 0);
        long temp = Double.doubleToLongBits(salary) >> 32;
        hash = 31 * hash + (int)(temp ^ (temp >> 32));
        hash = 31 * hash + (birth != null ? birth.hashCode() : 0);

        return hash;
    }

    // Rules:
    //  1. Reflection:  a.equals(a) == true                         -> true
    //  2. Symmetric:   a.equals(b) == b.equals(a)                  -> true
    //  3. Transitive:  a.equals(b) && b.equals(c) == a.equals(c)   -> true
    //  4. NotNull:     a.equals(null)                              -> false !!!


    @Override
    public boolean equals(Object obj) {
        if (obj == null || User.class != obj.getClass()) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        User temp = (User) obj;

        return id == temp.id &&
                salary == temp.salary &&
                (name != null ? name.equals(temp.name) : temp.name == null) &&
                (birth != null ? birth.equals(temp.birth) : temp.birth == null);
    }


}
