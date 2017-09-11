package ua.artcode.week1.day2_homework.part2.test;

import ua.artcode.week1.day2_homework.part1.utils.TestUtils;
import ua.artcode.week1.day2_homework.part2.model.MyString;

import java.util.Arrays;

/**
 * TDD (for MyString class).
 * Created by Alexey_O on 07.09.2017.
 */
public class TestMyString {
    // TODO: Write TDD for MyString class.
    /*
    * Написать класс строка
   	- создание на основе массива символов
   	- вывод на экран
   	- конкатенация
   	- понижение регистра
   	- повышение регистра
   	- поиск подстроки
   	- выделение подстроки
   	- удаление пробелов
   	- метод для сравнения с другой строкой*/

    public static void main(String[] args) {
        boolean testResult = true;

        testPrint();

        testResult &= testConcatCorrectly();
        testResult &= testConcatWrongly();

        testResult &= testToLowerCaseCorrectly();
        testResult &= testToLowerCaseWrongly();

        testResult &= testToUpperCaseCorrectly();
        testResult &= testToUpperCaseWrongly();

        testResult &= testSubstringCorrectly();
        testResult &= testSubstringWrongly();

        testResult &= testRemoveSubstringCorrectly();
        testResult &= testRemoveSubstringWrongly();

        testResult &= testRemoveWhitespacesCorrectly();
        testResult &= testRemoveWhiteSpacesWrongly();

        testResult &= testEqualsCorrectly();
        testResult &= testEqualsWrongly();

        System.out.println(" *** TDD result: " + (testResult ? "passed" : "not passed"));
    }

    private static void testPrint() {
        MyString myString = new MyString(new char[]{
                'M', 'y', ' ',
                'n', 'a', 'm', 'e', ' ',
                'i', 's', ' ',
                'A', 'l', 'e', 'x', '.'
        });

        System.out.println(" * Test name: testPrint, class: MyString, method: print(), STATUS (expected: \"My name is Alex.\"):");

        myString.print();
    }

    private static boolean testConcatCorrectly() {
        MyString myString1 = new MyString(new char[]{'M', 'y', ' '});
        MyString myString2 = new MyString(new char[]{'n', 'a', 'm', 'e', '.'});
        char[] expected = {'M', 'y', ' ', 'n', 'a', 'm', 'e', '.'};
        boolean testResult = Arrays.equals(myString1.concat(myString2).getSymbols(), expected);

        TestUtils.printTestsResult("testConcatCorrectly",
                "MyString",
                "concat()",
                testResult);
        return testResult;
    }

    private static boolean testConcatWrongly() {
        MyString myString1 = new MyString(new char[]{'A', 'l', 'e', 'x'});
        MyString myString2 = new MyString(null);
        MyString expected = null;
        boolean testResult = true;

        testResult &= (myString1.concat(myString2) == expected);
        testResult &= (myString2.concat(myString1) == expected);
        testResult &= (myString1.concat(null) == expected);
        testResult &= (myString2.concat(null) == expected);

        TestUtils.printTestsResult("testConcatWrongly",
                "MyString",
                "concat()",
                testResult);
        return testResult;
    }

    private static boolean testToLowerCaseCorrectly() {
        MyString myString = new MyString(new char[]{
                'M', 'y', ' ',
                'n', 'a', 'm', 'e', ' ',
                'i', 's', ' ',
                'A', 'l', 'e', 'x', '.'
        });
        char[] expected = {
                'm', 'y', ' ',
                'n', 'a', 'm', 'e', ' ',
                'i', 's', ' ',
                'a', 'l', 'e', 'x', '.'
        };
        boolean testResult = Arrays.equals(myString.toLowerCase().getSymbols(), expected);

        TestUtils.printTestsResult("testToLowerCaseCorrectly",
                "MyString",
                "toLowerCase()",
                testResult);
        return testResult;
    }

    private static boolean testToLowerCaseWrongly() {
        MyString myString = new MyString(null);
        MyString expected = null;
        boolean testResult = (myString.toLowerCase() == expected);

        TestUtils.printTestsResult("testToLowerCaseWrongly",
                "MyString",
                "toLowerCase()",
                testResult);
        return testResult;
    }

    private static boolean testToUpperCaseCorrectly() {
        MyString myString = new MyString(new char[]{
                'M', 'y', ' ',
                'n', 'a', 'm', 'e', ' ',
                'i', 's', ' ',
                'A', 'l', 'e', 'x', '.'
        });
        char[] expected = {
                'M', 'Y', ' ',
                'N', 'A', 'M', 'E', ' ',
                'I', 'S', ' ',
                'A', 'L', 'E', 'X', '.'
        };
        boolean testResult = Arrays.equals(myString.toUpperCase().getSymbols(), expected);

        TestUtils.printTestsResult("testToUpperCaseCorrectly",
                "MyString",
                "toUpperCase()",
                testResult);
        return testResult;
    }

    private static boolean testToUpperCaseWrongly() {
        MyString myString = new MyString(null);
        MyString expected = null;
        boolean testResult = (myString.toUpperCase() == expected);

        TestUtils.printTestsResult("testToUpperCaseWrongly",
                "MyString",
                "toUpperCase()",
                testResult);
        return testResult;
    }

    private static boolean testSubstringCorrectly() {
        MyString myString = new MyString(new char[]{
                'M', 'y', ' ',
                'p', 'h', 'o', 'n', 'e', ' ',
                'n', 'u', 'm', 'b', 'e', 'r'
        });
        char[] expected = new char[]{
                //'M', 'y', ' ',
                'p', 'h', 'o', 'n', 'e'//, ' ',
                //'n', 'u', 'm', 'b', 'e', 'r'
        };
        char[] resultCharArray = myString.substring(3, 7).getSymbols();
        boolean testResult = Arrays.equals(resultCharArray, expected);

        TestUtils.printTestsResult("testSubstringCorrectly",
                "MyString",
                "substring()",
                testResult);
        return testResult;
    }

    private static boolean testSubstringWrongly() {
        MyString myString = new MyString(new char[]{'p', 'h', 'o', 'n', 'e'});
        int[] testStartValues   = {2, -1, -2, 4, 10};
        int[] testEndValues     = {1,  0, -1, 5, 12};
        MyString expected = null;
        boolean testResult = true;

        for (int i = 0; i < testStartValues.length; i++) {
            testResult &= (myString.substring(testStartValues[i], testEndValues[i]) == expected);
        }

        TestUtils.printTestsResult("testSubstringWrongly",
                "MyString",
                "substring()",
                testResult);
        return testResult;
    }

    private static boolean testRemoveSubstringCorrectly() {
        MyString myString = new MyString(new char[]{
                'M', 'y', ' ',
                'p', 'h', 'o', 'n', 'e', ' ',
                'n', 'u', 'm', 'b', 'e', 'r'
        });
        char[] expected = new char[]{
                'M', 'y', ' ',
                //'p', 'h', 'o', 'n', 'e', ' ',
                'n', 'u', 'm', 'b', 'e', 'r'
        };
        char[] resultCharArray = myString.removeSubstring(3, 8).getSymbols();
        boolean testResult = Arrays.equals(resultCharArray, expected);

        TestUtils.printTestsResult("testRemoveSubstringCorrectly",
                "MyString",
                "removeSubstring()",
                testResult);
        return testResult;
    }

    private static boolean testRemoveSubstringWrongly() {
        MyString myString = new MyString(new char[]{'p', 'h', 'o', 'n', 'e'});
        int[] testStartValues   = {2, -1, -2, 4, 10};
        int[] testEndValues     = {1,  0, -1, 5, 12};
        MyString expected = null;
        boolean testResult = true;

        for (int i = 0; i < testStartValues.length; i++) {
            testResult &= (myString.removeSubstring(testStartValues[i], testEndValues[i]) == expected);
        }

        TestUtils.printTestsResult("testRemoveSubstringWrongly",
                "MyString",
                "removeSubstring()",
                testResult);
        return testResult;
    }

    private static boolean testRemoveWhitespacesCorrectly() {
        MyString myString = new MyString(new char[]{' ', ' ', 'a', ' ', 'l', 'e', ' ', 'x', ' ', ' '});
        char[] expected = {'a', 'l', 'e', 'x'};
        boolean testResult = Arrays.equals(myString.removeWhitespaces().getSymbols(), expected);

        TestUtils.printTestsResult("testRemoveWhiteSpacesCorrectly",
                "MyString",
                "removeWhitespaces()",
                testResult);
        return testResult;
    }

    private static boolean testRemoveWhiteSpacesWrongly() {
        MyString myStrings = new MyString(null);
        MyString expected = null;
        boolean testResult = (myStrings.removeWhitespaces() == expected);

        TestUtils.printTestsResult("testRemoveWhiteSpacesWrongly",
                "MyString",
                "removeWhitespaces()",
                testResult);
        return testResult;
    }

    private static boolean testEqualsCorrectly() {
        MyString testMyString1 = new MyString(new char[]{'a', 'l', 'e', 'x'});
        MyString testMyString2 = new MyString(new char[]{'a', 'l', 'e', 'x'});
        boolean expected = true;
        boolean testResult = testMyString1.equals(testMyString2);

        TestUtils.printTestsResult("testEqualsCorrectly",
                "MyString",
                "equals()",
                testResult);
        return testResult;
    }

    private static boolean testEqualsWrongly() {
        MyString myString = new MyString(new char[]{'a', 'l', 'e', 'x'});
        MyString[] testMyStrings = {
                new MyString(new char[]{'a', 'l', 'e', 'x', 'e', 'y'}),
                new MyString(new char[0]),
                new MyString(null)};
        boolean expected = false;
        boolean testResult = true;

        for (MyString testElement: testMyStrings) {
            testResult &= (myString.equals(testElement) == expected);
        }

        MyString anotherTestMyString = new MyString(null);
        testResult &= (anotherTestMyString.equals(testMyStrings[testMyStrings.length - 1]) == expected);

        TestUtils.printTestsResult("testEqualsWrongly",
                "MyString",
                "equals()",
                testResult);
        return testResult;
    }


}
