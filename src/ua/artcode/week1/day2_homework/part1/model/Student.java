package ua.artcode.week1.day2_homework.part1.model;

import java.util.Arrays;

/**
 * Created by Alexey_O on 07.09.2017.
 */



public class Student {

    // TODO: Write TDD for Student class.

    /*
    * Студент
     	поля:
     		Имя
     		Адрес
     		Предметы

     	методы:
     		учиться
     		добавить предмет
     		удалить предмет из списка последний
     		показать всю информацию о предметах
     		получить средний бал за все предметы
    * */

    public static final int DEFAULT_SUBLECT_ARRAY_LENGTH = 10;

    // Fields and properties:
    private String name;
    private String address;
    private Subject[] subjectList = new Subject[DEFAULT_SUBLECT_ARRAY_LENGTH];
    private int subjectsCounter;

    // Constructors:
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return address;
    }

    public void setAddr(String address) {
        this.address = address;
    }

    public int getSubjectsCounter() {
        return subjectsCounter;
    }

    // Other methods:
    public boolean addSubject(Subject subject) {
        if (subject == null) {
            return false;
        }

        if (subjectsCounter == subjectList.length) {
            resizeSubjectList();
        }
        subjectList[subjectsCounter++] = subject;
        return true;
    }

    public boolean deleteLastSubject() {
        if (subjectsCounter == 0) {
            return false;
        }
        subjectList[subjectsCounter - 1] = null;
        subjectsCounter--;
        return true;
    }

    public Subject[] getSubjectsInfo() {
        return subjectList;
    }

    public void printSubjectsInfo() {
        System.out.println(Arrays.toString(subjectList).replaceAll("},", "};\n"));
    }

    public int getAverage() {
        if (subjectsCounter == 0) {
            return 0;
        }

        int sumOfMarks = 0;

        for (int i = 0; i < subjectsCounter; i++) {
            sumOfMarks += subjectList[i].getMark();
        }

        return sumOfMarks / subjectsCounter;
    }

    // Private methods:
    private void resizeSubjectList() {
        Subject[] newSubjectList = new Subject[subjectList.length * 2];
        for (int i = 0; i < subjectList.length; i++) {
            newSubjectList[i] = subjectList[i];
        }
        subjectList = newSubjectList;
    }

}
