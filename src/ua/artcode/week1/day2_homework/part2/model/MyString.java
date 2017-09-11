package ua.artcode.week1.day2_homework.part2.model;

import ua.artcode.week1.day2_homework.part2.utils.MyStringUtils;

import java.util.Arrays;

/**
 * Created by Alexey_O on 07.09.2017.
 */
public class MyString implements IMyString {
    // TODO: Write MyString class by its TDD.
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

    // Fields and properties:
    private char[] symbols;

    // Constructors:
    public MyString(char[] symbols) {
        this.symbols = symbols;
    }

    // Getters and setters:
    public char[] getSymbols() {
        return symbols;
    }

    public void setSymbols(char[] symbols) {
        this.symbols = symbols;
    }


    // Interface methods:
    @Override
    public void print() {
        if (MyStringUtils.charArrayValidator(symbols)) {
            for (char element: symbols) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    @Override
    public MyString concat(IMyString iMyString) {
        if (iMyString == null) {
            return null;
        }

        MyString myString = (MyString) iMyString;

        if (!MyStringUtils.charArrayValidator(symbols) ||
                !MyStringUtils.charArrayValidator(myString.getSymbols())) {
            return null;
        }

        return new MyString(
                MyStringUtils.joinCharArrays(
                        symbols,
                        myString.getSymbols()) );
    }

    @Override
    public MyString toLowerCase() {
        if (!MyStringUtils.charArrayValidator(symbols)) {
            return null;
        }

        char[] newSymbols = new char[symbols.length];
        for (int i = 0; i < symbols.length; i++) {
            newSymbols[i] = MyStringUtils.makeCharLower(symbols[i]);
        }

        return new MyString(newSymbols);
    }

    @Override
    public MyString toUpperCase() {
        if (!MyStringUtils.charArrayValidator(symbols)) {
            return null;
        }

        char[] newSymbols = new char[symbols.length];
        for (int i = 0; i < symbols.length; i++) {
            newSymbols[i] = MyStringUtils.makeCharUpper(symbols[i]);
        }

        return new MyString(newSymbols);
    }

    @Override
    public MyString substring(int start, int end) {
        if (!MyStringUtils.charArrayValidator(symbols)) {
            return null;
        }

        if (start > end ||
                start < 0 || end < 0  ||
                start >= symbols.length || end >= symbols.length) {
            return null;
        }

        return new MyString(Arrays.copyOfRange(symbols, start, end + 1));
    }

    @Override
    public MyString removeSubstring(int start, int end) {
        if (!MyStringUtils.charArrayValidator(symbols)) {
            return null;
        }

        if (start > end ||
                start < 0 || end < 0  ||
                start >= symbols.length || end >= symbols.length) {
            return null;
        }

        return new MyString(
                MyStringUtils.joinCharArrays(
                        Arrays.copyOf(symbols, start),
                        Arrays.copyOfRange(symbols, end + 1, symbols.length)) );
    }

    @Override
    public MyString removeWhitespaces() {
        if (!MyStringUtils.charArrayValidator(symbols)) {
            return null;
        }

        char[] tempSymbols = new char[symbols.length];
        int trueLengthCounter = 0;

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == ' ') {
                continue;
            }
            tempSymbols[trueLengthCounter++] = symbols[i];
        }

        return new MyString(Arrays.copyOf(tempSymbols, trueLengthCounter));
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        MyString myString = (MyString) object;
        if (!MyStringUtils.charArrayValidator(symbols) || !MyStringUtils.charArrayValidator(myString.getSymbols())) {
            return false;
        }

        if (this == myString || this.symbols == myString.getSymbols() ||
                Arrays.equals(myString.getSymbols(), symbols)) {
            return true;
        }
        return false;
    }
}
