package ua.artcode.week1.day2.test;

import ua.artcode.week1.day2.model.MyGroup;
import ua.artcode.week1.day2.model.Student;
import ua.artcode.week1.day2.util.StudentUtils;

/**
 * TDD
 */
public class TestGroup {
    public static void main(String[] args) {
        MyGroup group = new MyGroup("ACO21");

        Student student1 = StudentUtils.generateStudent();
        boolean expected = true;
        boolean practical = group.addStudent(student1);
        System.out.println(String.format("Test passed: %b", (expected == practical)));

        Student student2 = group.get(0);
        System.out.printf("res %s, method %s, ex %s = practical %s\n",
                student1 == student2, "get", student1.toString(), student2.toString());
    }













    // Positive test:
    public static void testAddStudent() {

    }

    // Negative test:
    public static void testAddStudentWithNull() {

    }

    public static void testRemoveStudent() {

    }

    public static void testGetStudent() {

    }

    public static void testSearchStudent() {

    }
}
