package ua.artcode.week1.day2_homework.part2.utils;

import java.util.Arrays;

/**
 * Created by Alexey_O on 11.09.2017.
 */
public class MyStringUtils {

    public static boolean charArrayValidator(char[] charArray) {
        return charArray != null;
    }

    public static char[] joinCharArrays(char[] charArray1, char[] charArray2) {
        if (!charArrayValidator(charArray1) || !charArrayValidator(charArray2)) {
            return null;
        }

        char[] newCharArray = new char[charArray1.length + charArray2.length];

        for (int i = 0; i < charArray1.length; i++) {
            newCharArray[i] = charArray1[i];
        }
        for (int i = 0, j = charArray1.length; i < charArray2.length; i++, j++) {
            newCharArray[j] = charArray2[i];
        }

        return newCharArray;
    }

    public static char makeCharLower(char symbol) {
        int symbolsCode = (int) symbol;
        if (symbolsCode > 0x40 && symbolsCode < 0x5B) {
            return (char) (symbolsCode + 0x20);
        } else {
            return symbol;
        }
    }

    public static char makeCharUpper(char symbol) {
        int symbolsCode = (int) symbol;
        if (symbolsCode > 0x60 && symbolsCode < 0x7B) {
            return (char) (symbolsCode - 0x20);
        } else {
            return symbol;
        }
    }
}
