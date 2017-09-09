package ua.artcode.week1.day2_homework.part1.test;

import ua.artcode.week1.day2_homework.part1.model.Student;
import ua.artcode.week1.day2_homework.part1.model.Subject;
import ua.artcode.week1.day2_homework.part1.utils.SubjectUtils;
import ua.artcode.week1.day2_homework.part1.utils.TestUtils;

import java.util.Arrays;

/**
 * TDD (for Student class).
 * Created by Alexey_O on 06.09.2017.
 */
public class TestStudent {

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

    public static void main(String[] args) {

        boolean testMark = true;

        testMark &= testAddSubjectCorectly();
        testMark &= testAddSubjectWrongly();

        testMark &= testDeleteLastSubjectExisting();
        testMark &= testDeleteLastSubjectNonExisting();

        testMark &= testGetSubjectsInfoFromEmptyList();
        testMark &= testGetSubjectsInfoFromNonEmptyList();

        testMark &= testGetAverageFromEmptyList();
        testMark &= testGetAverageFromNonEmptyList();

        testPrintSubjectsInfo();

        System.out.println("\n TDD status: " + (testMark ? "passed." : "not passed."));

    }

    private static boolean testAddSubjectCorectly() {
        Student student = new Student("TestName", "TestAddress");
        Subject[] testSubjects = new Subject[Student.DEFAULT_SUBLECT_ARRAY_LENGTH / 2];
        boolean expectedValue = true;
        boolean testResult = true;

        for (int i = 0; i < testSubjects.length; i++) {
            testSubjects[i] = SubjectUtils.generateSubject();
        }

        for (int i = 0; i < testSubjects.length; i++) {
            if (student.addSubject(testSubjects[i]) != expectedValue) {
                testResult = false;
            }
        }

        if (student.getSubjectsCounter() != testSubjects.length) {
            testResult = false;
        }

        TestUtils.printTestsResult("testAddSubjectCorectly",
                "Student",
                "addSubject()",
                testResult);
        return testResult;
    }

    private static boolean testAddSubjectWrongly() {
        Student student = new Student("TestName", "TestAddress");
        boolean expectedValue = false;
        boolean testResult = (student.addSubject(null) == expectedValue);

        TestUtils.printTestsResult("testAddSubjectWrongly",
                "Student",
                "addSubject()",
                testResult);
        return testResult;
    }

    private static boolean testDeleteLastSubjectExisting() {
        Student student = new Student("TestName", "TestAddress");
        boolean expectedValue = true;
        boolean testResult = true;

        for (int i = 0; i < Student.DEFAULT_SUBLECT_ARRAY_LENGTH / 2; i++) {
            student.addSubject(SubjectUtils.generateSubject());
        }

        for (int i = 0; i < Student.DEFAULT_SUBLECT_ARRAY_LENGTH / 2; i++) {
            if (student.deleteLastSubject() != expectedValue) {
                testResult = false;
            }
        }

        if (student.getSubjectsCounter() != 0) {
            testResult = false;
        }

        TestUtils.printTestsResult("testDeleteLastSubjectExisting",
                "Student",
                "deleteLastSubject()",
                testResult);
        return testResult;
    }

    private static boolean testDeleteLastSubjectNonExisting() {
        Student student = new Student("TestName", "TestAddress");
        boolean expectedValue = false;
        boolean testResult = (student.deleteLastSubject() == expectedValue);

        TestUtils.printTestsResult("testDeleteLastSubjectNonExisting",
                "Student",
                "deleteLastSubject()",
                testResult);
        return testResult;
    }

    private static boolean testGetSubjectsInfoFromEmptyList() {
        Student student = new Student("TestName", "TestAddress");
        Subject[] expectedValue = new Subject[Student.DEFAULT_SUBLECT_ARRAY_LENGTH];
        boolean testResult = Arrays.equals(student.getSubjectsInfo(), expectedValue);

        TestUtils.printTestsResult("testGetSubjectsInfoFromEmptyList",
                "Student",
                "getSubjectsInfo()",
                testResult);
        return testResult;
    }

    private static boolean testGetSubjectsInfoFromNonEmptyList() {
        Student student = new Student("TestName", "TestAddress");
        Subject[] testSubjects = new Subject[Student.DEFAULT_SUBLECT_ARRAY_LENGTH];
        boolean testResult;

        for (int i = 0; i < Student.DEFAULT_SUBLECT_ARRAY_LENGTH / 2; i++) {
            testSubjects[i] = SubjectUtils.generateSubject();
            student.addSubject(testSubjects[i]);
        }

        Subject[] returnedSubjects = student.getSubjectsInfo();

        testResult = Arrays.equals(returnedSubjects, testSubjects);

        TestUtils.printTestsResult("testGetSubjectsInfoFromNonEmptyList",
                "Student",
                "getSubjectsInfo()",
                testResult);
        return testResult;
    }

    private static boolean testGetAverageFromEmptyList() {
        Student student = new Student("TestName", "TestAddress");
        int expected = 0;
        boolean testResult = (student.getAverage() == expected);

        TestUtils.printTestsResult("testGetAverageFromEmptyList",
                "Student",
                "getAverage()",
                testResult);
        return testResult;
    }

    private static boolean testGetAverageFromNonEmptyList() {
        Student student = new Student("TestName", "TestAddress");
        int expected = 40;
        boolean testResult;

        student.addSubject(new Subject("Math", 90, 90));
        student.addSubject(new Subject("History", 66, 22));
        testResult = (student.getAverage() == expected);

        TestUtils.printTestsResult("testGetAverageFromNonEmptyList",
                "Student",
                "getAverage()",
                testResult);
        return testResult;
    }

    private static void testPrintSubjectsInfo() {
        Student student = new Student("Alex", "address");
        for (int i = 0; i < Student.DEFAULT_SUBLECT_ARRAY_LENGTH; i++) {
            student.addSubject(SubjectUtils.generateSubject());
        }
        System.out.println(" * Test name: testPrintSubjectsInfo, class: Student, method: printSubjectsInfo, Status:");
        student.printSubjectsInfo();
    }

}
