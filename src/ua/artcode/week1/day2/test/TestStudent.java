package ua.artcode.week1.day2.test;

import ua.artcode.week1.day2.model.*;
import ua.artcode.week1.day2.util.StudentUtils;


/**
 * Created by Alexey_O on 05.09.2017.
 */
public class TestStudent {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Olexiy",
                "+38-068-868-08-42",
                2600d,
                "Kyiv",
                "pr. Heroiv Stalingrada",
                "9a");
        System.out.println("Name (student1): " + student1.getName());
        Student student3 = new Student("Alex",
                "+38-096-674-11-05",
                "alex_o@ukr.net",
                3150d,
                5,
                new MyDate(1994, 11, 26),
                new MyAddress("Kharkiv", "Lenina str.", "11b"));

        System.out.println("Date (student3): " + student3.getDate() + "\nAddress (student3): " + student3.getAddress());

        Student[] studentsArr = new Student[10];
        for (int i = 0; i < studentsArr.length; i++) {
            studentsArr[i] = StudentUtils.generateStudent();
        }

        for (int i = 0; i < studentsArr.length; i++) {
            System.out.println(String.format("%d) Name: %s;\nAddress: %s\nDate: %s",
                    i + 1,
                    studentsArr[i].getName(),
                    studentsArr[i].getAddress(),
                    studentsArr[i].getDate()));
        }


        // TODO: create MyGroup class (description below).
        MyGroup group = new MyGroup("ACO21");
        for (int i = 0; i < 10; i++) {
            group.addStudent(StudentUtils.generateStudent());
        }
        group.showAll();
        Student groupMember1 = group.get(0);
        Student[] groupMembers = group.search("Oleg");
        Student groupMember2 = group.remove(2);
    }

}
