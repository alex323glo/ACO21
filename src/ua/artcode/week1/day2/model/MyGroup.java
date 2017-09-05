package ua.artcode.week1.day2.model;

import java.util.LinkedList;

/**
 * Created by Alexey_O on 05.09.2017.
 */
public class MyGroup {

    public static final int DEFAULT_GROUP_SIZE = 15;
    private Student[] listStudent;
    private int size;
    private String name;

    // Ctrl + Shift + '/' (used to comment with /**/)
    /*public MyGroup() {
        this("no name", DEFAULT_GROUP_SIZE);
    }*/

    public MyGroup(String name) {
        listStudent = new Student[DEFAULT_GROUP_SIZE];
        this.name = (name != null && !name.isEmpty()) ? name : "no name";
    }

    public MyGroup(String name, int groupSize) {
        listStudent = (groupSize > 0) ? new Student[groupSize] : new Student[DEFAULT_GROUP_SIZE];
        this.name = (name != null && !name.isEmpty()) ? name : "none";
    }

    public boolean addStudent(Student student) {
        if (student == null) {
            System.out.println("ERROR: student is null!");
            return false;
        }
        if (size == listStudent.length) {
            System.out.println("ERROR: group is full!");
            return false;
        }

        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] == null) {
                listStudent[i] = student;
                size++;
                System.out.println("Student was successfully added to group!");
                return true;
            }
        }
        System.out.println("ERROR: can't add new student!");
        return false;
    }

    public void showAll() {
        if (size == 0) {
            System.out.println("Group is empty!");
        }
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] == null) continue;

            System.out.println(i + ". " + listStudent[i].toString());
        }
    }

    public Student remove(int index) {
        if (size == 0) {
            System.out.println("ERROR: group is empty!");
            return null;
        }
        if (index < 0 || index > size || listStudent[index] == null) {
            System.out.println("ERROR: wrong student's index!");
            return null;
        }

        Student tempStudent = listStudent[index];
        listStudent[index] = null;
        size--;
        System.out.println("Student was successfully removed from group!");
        return tempStudent;
    }

    public Student get(int index) {
        if (size == 0) {
            System.out.println("ERROR: group is empty!");
            return null;
        }
        if (index < 0 || index > size || listStudent[index] == null) {
            System.out.println("ERROR: wrong student's index!");
            return null;
        }

        return listStudent[index];
    }

    public Student[] search(String name) {
        if (size == 0) {
            System.out.println("ERROR: group is empty!");
            return null;
        }
        if (name == null || name.isEmpty()) {
            System.out.println("ERROR: name is empty or is null!");
            return null;
        }

        Student[] tempResultArr = new Student[listStudent.length];
        int resultArrCounter = 0;

        for (Student groupMember: listStudent) {
            if (groupMember != null && groupMember.getName().equals(name)) {
                tempResultArr[resultArrCounter++] = groupMember;
            }
        }

        if (resultArrCounter == 0) {
            System.out.println("No students with such name!");
            return null;
        }

        Student[] resultArr = new Student[resultArrCounter];
        for (int i = 0; i < resultArrCounter; i++) {
            resultArr[i] = tempResultArr[i];
        }
        return resultArr;
    }

    // Getters (for TDD):
    public int getSize() {
        return size;
    }

    public Student[] getListStudent() {
        return listStudent;
    }
}
