package ua.artcode.week2.day2.interf;

/**
 * Created by Alexey_O on 08.09.2017.
 */
public class WorldExample {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Student student = new Student();
        SuperPerson superPerson = new SuperPerson();

        Company company = new Company();

        University university = new University();

        company.visit(employee);
        university.visit(student);

        // after double implementation and correcting headers of study() and work() in University and Company classes:
        company.visit(superPerson);
        university.visit(superPerson);
    }

}

interface IEmployee {

    void work();

}

interface IStudent {

    void study();

}

class Company {

    void visit(IEmployee employee) {
        employee.work();
    }

}

class University {

    void visit(IStudent student) {
        student.study();
    }

}

class SuperPerson implements IEmployee, IStudent {

    @Override
    public void work() {
        System.out.println("Superperson works!");
    }

    @Override
    public void study() {
        System.out.println("Superperson learns!");
    }

}

class Employee implements IEmployee {

    public void work() {
        System.out.println("Work!");
    }

}

class Student implements IStudent {

    public void study() {
        System.out.println("Learn!");
    }

}
