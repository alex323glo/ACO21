package ua.artcode.week4.day3.task1;

public class Recursion {

    public static int count8(String digits) {
        if (digits.length() < 2) {
            return checkSymbol(digits.charAt(0));
        }

        return checkSymbol(digits.charAt(0)) + count8(digits.substring(1));
    }

    public static int count8(int number) {
        if (number < 10) {
            return number == 8 ? 1 : 0;
        }

        return ((number % 10 == 8) ? 1 : 0) + count8(number / 10);

    }



    private static int checkSymbol(char symbol) {
        return symbol == '8' ? 1 : 0;
    }

}
