package ua.artcode.week1.day2_homework1.test;

import ua.artcode.week1.day2_homework1.model.Subject;

/**
 * TDD (for class Subject)
 * Created by Alexey_O on 06.09.2017.
 */

public class TestSubject {

    public static void main(String[] args) {
        boolean testMark = true;

        testMark &= testSetNameWithDiffParams();

        testMark &= testGetNameFromCreatedSubject();
        testMark &= testGetNameAfterSet();

        testMark &= testSetDifferentSemesterHours();

        testMark &= testGetSemesterHoursFromCreatedSubject();
        testMark &= testGetSemesterHoursAfterSet();

        testMark &= testSetDifferentWorkHours();

        testMark &= testGetWorkHoursFromCreatedSubject();
        testMark &= testGetWorkHoursAfterSet();

        testMark &= testExamSeveralTimes();

        testMark &= testGetMarkFromCreatedSubject();
        testMark &= testGetMarkWithoutExam();
        testMark &= testGetMarkWithExam();

        System.out.println("TDD status: " + testMark);
    }

    public static boolean testSetNameWithDiffParams() {
        String[] testValue = {"Math", "", null};
        boolean[] expected = {true, false, false};
        boolean testResult = true;

        Subject subject = new Subject();
        for (int i = 0; i < testValue.length; i++) {
            testResult &= (expected[i] == subject.setName(testValue[i]));
        }

        TestUtils.printTestsResult("testSetNameWithDiffParams",
                "Subject",
                "setName()",
                testResult);
        return testResult;
    }



    public static boolean testGetNameFromCreatedSubject() {
        String expected = "none";
        boolean testResult;

        Subject subject = new Subject();
        testResult = expected.equals(subject.getName());

        TestUtils.printTestsResult("testGetNameFromCreatedSubject",
                "Subject",
                "getName()",
                testResult);
        return testResult;
    }

    public static boolean testGetNameAfterSet() {
        String testValue = "John";
        String expected = "John";
        boolean testResult;

        Subject subject = new Subject();
        subject.setName(testValue);
        testResult = expected.equals(subject.getName());

        TestUtils.printTestsResult("testGetNameAfterSet",
                "Subject",
                "getName()",
                testResult);
        return testResult;
    }



    public static boolean testSetDifferentSemesterHours() {
        int[] testVaue =        {-20, 0, 80};
        boolean[] expected =    {false, false, true};
        boolean testResult = true;

        Subject subject = new Subject();
        for (int i = 0; i < testVaue.length; i++) {
            testResult &= (expected[i] == subject.setSemesterHours(testVaue[i]));
        }

        TestUtils.printTestsResult("testSetDifferentSemesterHours",
                "Subject",
                "setSemesterHours()",
                testResult);
        return testResult;
    }



    public static boolean testGetSemesterHoursFromCreatedSubject() {
        int expected = 1;
        boolean testResult;

        Subject subject = new Subject();
        testResult = (expected == subject.getSemesterHours());

        TestUtils.printTestsResult("testGetSemesterHoursFromCreatedSubject",
                "Subject",
                "getSemesterHours()",
                testResult);
        return testResult;
    }

    public static boolean testGetSemesterHoursAfterSet() {
        int testValue = 40;
        int expected = 40;
        boolean testResult;

        Subject subject = new Subject();
        subject.setSemesterHours(testValue);
        testResult = (expected == subject.getSemesterHours());

        TestUtils.printTestsResult("testGetSemesterHoursAfterSet",
                "Subject",
                "getSemesterHours()",
                testResult);
        return testResult;
    }



    public static boolean testSetDifferentWorkHours() {
        int[] testVaue = {-20, 0, 80};
        boolean[] expected = {false, true, true};
        boolean testResult = true;

        Subject subject = new Subject();
        for (int i = 0; i < testVaue.length; i++) {
            subject.setSemesterHours(testVaue[i]);
            testResult &= (expected[i] == subject.setWorkHours(testVaue[i]));
        }

        TestUtils.printTestsResult("testSetDifferentWorkHours",
                "Subject",
                "setWorkHours()",
                testResult);
        return testResult;
    }



    public static boolean testGetWorkHoursFromCreatedSubject() {
        int expected = 0;
        boolean testResult;

        Subject subject = new Subject();
        testResult = (expected == subject.getWorkHours());

        TestUtils.printTestsResult("testGetWorkHoursFromCreatedSubject",
                "Subject",
                "getWorkHours()",
                testResult);
        return testResult;
    }

    public static boolean testGetWorkHoursAfterSet() {
        int testValue = 40;
        int expected = 40;
        boolean testResult;

        Subject subject = new Subject();
        subject.setSemesterHours(testValue);
        subject.setWorkHours(testValue);
        testResult = (expected == subject.getWorkHours());

        TestUtils.printTestsResult("testGetWorkHoursAfterSet",
                "Subject",
                "getWorkHours()",
                testResult);
        return testResult;
    }



    public static boolean testExamSeveralTimes() {
        Subject subject = new Subject();
        int tempExamMark;

        for (int i = 0; i < 10; i++) {
            tempExamMark = subject.exam();
            if (tempExamMark < 0 || tempExamMark > 40) {
                TestUtils.printTestsResult("testExamSeveralTimes",
                        "Subject",
                        "exam()",
                        false);
            }
        }
        TestUtils.printTestsResult("testExamSeveralTimes",
                "Subject",
                "exam()",
                true);
        return true;
    }



    public static boolean testGetMarkFromCreatedSubject() {
        int expected = 0;
        boolean testResult;

        Subject subject = new Subject();
        testResult = (expected == subject.getMark());

        TestUtils.printTestsResult("testGetMarkFromCreatedSubject",
                "Subject",
                "getMark()",
                testResult);
        return testResult;
    }

    public static boolean testGetMarkWithoutExam() {
        int[] testValueSemesterHours =  {80, 120, 20, 50, 10, -5, 0};
        int[] testValueWorkHours =      {40, 30, 160, 0, -20, 120, 25};
        int[] expected =                {30, 15, 15, 0, 0, 0, 0};
        boolean testResult = true;

        Subject subject = new Subject();
        for (int i = 0; i < testValueSemesterHours.length; i++) {
            subject.setSemesterHours(testValueSemesterHours[i]);
            subject.setWorkHours(testValueWorkHours[i]);
            testResult &= (expected[i] == subject.getMark());
        }

        TestUtils.printTestsResult("testGetMarkWithoutExam",
                "Subject",
                "getMark()",
                testResult);
        return testResult;
    }

    public static boolean testGetMarkWithExam() {
        int[] testValueSemesterHours =  {80, 120, 20, 50, 10, -5, 0};
        int[] testValueWorkHours =      {40, 30, 160, 0, -20, 120, 25};
        int[] expected =                {30, 15, 15, 0, 0, 0, 0};
        boolean testResult = true;

        Subject subject = new Subject();
        int tempExamMark;
        for (int i = 0; i < testValueSemesterHours.length; i++) {
            subject.setSemesterHours(testValueSemesterHours[i]);
            subject.setWorkHours(testValueWorkHours[i]);
            tempExamMark = subject.exam();
            testResult &= ((expected[i] + tempExamMark) == subject.getMark());
        }

        TestUtils.printTestsResult("testGetMarkWithExam",
                "Subject",
                "getMark()",
                testResult);
        return testResult;
    }
}
