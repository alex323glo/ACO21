package ua.artcode.week1.day2.util;

/**
 * Created by Alexey_O on 05.09.2017.
 */
public class NumberTools {

    // Generator of int/double number:
    public static int generateNumber(int left, int right) {
        return left + (int)(Math.random() * (right - left));
    }

    public static double generateNumber(double left, double right) {
        return left + Math.random() * (right - left);
    }

    public static double generateNumber(double left, double right, int accuracy) {
        double multiplier = Math.pow(10, accuracy);
        return  ((double) ((int)(generateNumber(left, right) * multiplier))) / multiplier;
    }

    // Generator of digital string:
    public static String generateDigitalString(int numOfDigits) {
        if (numOfDigits < 0) return null;
        String digits = "";
        for (int i = 0; i < numOfDigits; i++) {
            digits += "" + (int)(Math.random() * 10);
        }
        return digits;
    }
}
