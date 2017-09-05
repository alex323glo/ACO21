package ua.artcode.week1.day1.test;

import ua.artcode.week1.day1.model.Student;

/**
 * Created by Alexey_O on 04.09.2017.
 */
public class TestStudent {
    public static void main(String[] args) {

        // It will create an instance (init all fields),
        // allocate memory for student.
        Student student1 = new Student();

        Student student2 = null;

        student1.init("Sasha", "+38-063-617-55-12", 4000, 1996, 10, 11);

//        student1.city = "Kiev";
//        student1.name = "Sasha";
//        student1.phone = "+38-063-617-55-12";
//        student1.email = "kiev@gmail.com";
//        student1.paidMoney = 4000;


//        System.out.println(student1.myDate.month);
        System.out.println(student1.getDate());
        //System.out.println(student1.street.toLowerCase());    // NullPointerException !
        System.out.println("Student name " + student1.getName() + ".");

//        System.out.println(StudentUtils.studentToString(student1));   // no need to use it!
        System.out.println(student1.toString());

        student2 = student1;

        student2.init("Olexiy", "+38-033-333-33-33", 3300.5d, 1998, 02, 21);
        System.out.println(student2.toString());
    }
}

/*
* TODO: Methods of class String.
* TODO: Methods of class Array.
* */
