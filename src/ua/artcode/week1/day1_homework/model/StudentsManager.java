package ua.artcode.week1.day1_homework.model;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Alexey_O on 04.09.2017.
 */
public class StudentsManager {

    private LinkedList<Student> studentsList = new LinkedList<Student>();
    Scanner scanner = new Scanner(System.in);
    int idCounter;

    private void callStudentsCreateForm() {
        System.out.println("\n\n--------------------------------------------------");
        Student tempStudent = new Student(idCounter);
        System.out.println("Input name:");
        if (!tempStudent.setName(scanner.nextLine())) {
            System.out.println("ERROR: wrong name was inputed!");
            return;
        }

        System.out.println("Input email:");
        if (!tempStudent.setEmail(scanner.nextLine())) {
            System.out.println("ERROR: wrong email was inputed!");
            return;
        }

        System.out.println("Input phone number:");
        if (!tempStudent.setPhoneNumber(scanner.nextLine())) {
            System.out.println("ERROR: wrong phone number was inputed!");
            return;
        }

        System.out.println("Input paid money:");
        if (!tempStudent.setSalary(Double.parseDouble(scanner.nextLine()))) {
            System.out.println("ERROR: wrong paid money was inputed!");
            return;
        }

        System.out.println("Input tasks number:");
        if (!tempStudent.setTaskCount(Integer.parseInt(scanner.nextLine()))) {
            System.out.println("ERROR: wrong tasks number was inputed!");
            return;
        }

        System.out.println("Input date:");
        String[] stringDateArray = scanner.nextLine().split("-");
        if (stringDateArray.length != 3 || !tempStudent.setDate(
                Integer.parseInt(stringDateArray[0]),
                Integer.parseInt(stringDateArray[1]),
                Integer.parseInt(stringDateArray[2]))) {
            System.out.println("ERROR: wrong date was inputed!");
            return;
        }

        System.out.println("Input address:");
        String[] stringAddress = scanner.nextLine().split(",");
        if (stringAddress.length != 3 || !tempStudent.setAddress(
                stringAddress[0],
                stringAddress[1],
                stringAddress[2])) {
            System.out.println("ERROR: wrong address was inputed!");
            return;
        }

        //If all is OK
        studentsList.add(tempStudent);

        idCounter++;
    }

    private void callIdDeleteForm() {
        System.out.println("\n\n--------------------------------------------------");
        if (studentsList.size() < 1) {
            System.out.println("Student list is empty!");
            return;
        }
        Student searchedStudent = searchStudentById();
        if (searchedStudent == null) return;
        studentsList.remove(searchedStudent);
        System.out.println("Student with ID \"" + searchedStudent.getId() + "\" was successfully deleted!");
    }

    private void callIdSearchForm() {
        System.out.println("\n\n--------------------------------------------------");
        if (studentsList.size() < 1) {
            System.out.println("Student list is empty!");
            return;
        }
        Student searchedStudent = searchStudentById();
        if (searchedStudent == null) return;
        System.out.println("Searched student:\n" + searchedStudent.getWholeInfo());
    }

    private Student searchStudentById() {
        System.out.println("Input students ID:");
        int searchedId = Integer.parseInt(scanner.nextLine());
        if (searchedId < 0) {
            System.out.println("ERROR: wrong ID was inputed!");
            return null;
        }
        for (Student tempStudent: studentsList) {
            if (tempStudent.getId() == searchedId) {
                return tempStudent;
            }
        }
        System.out.println("No student with such ID!");
        return null;
    }

    private void printAllStudents() {
        System.out.println("\n\n--------------------------------------------------");
        if (studentsList.size() < 1) {
            System.out.println("Student list is empty!");
            return;
        }
        System.out.println("All students (" + studentsList.size() + "):");
        for (Student tempStudent: studentsList) {
            System.out.println("------------------------------\n" + tempStudent.getWholeInfo());
        }
        System.out.println("------------------------------");
    }

    public void callMainMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("ACO-12   count: " + studentsList.size());
        System.out.println("\n1. Create\n2. Delete\n3. Search by ID\n4. Show all students\n5. Exit\n");
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                callStudentsCreateForm();
                break;
            case 2:
                callIdDeleteForm();
                break;
            case 3:
                callIdSearchForm();
                break;
            case 4:
                printAllStudents();
                break;
            case 5:
                System.exit(0);
                break;
        }
        callMainMenu();
    }
}
