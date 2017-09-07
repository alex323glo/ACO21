package ua.artcode.week1.day2_homework1.test;

/**
 * Created by Alexey_O on 06.09.2017.
 */
public class TestUtils {
    public static void printTestsResult(String testName, String testedClassName,
                                        String testedMethodName, boolean status) {
        System.out.printf(" * Test name: %s, class: %s, method: %s, STATUS: %s\n",
                testName,
                testedClassName,
                testedMethodName,
                (status ? "passed" : "not passed"));
    }
}
