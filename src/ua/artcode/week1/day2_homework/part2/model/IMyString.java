package ua.artcode.week1.day2_homework.part2.model;

/**
 * Created by Alexey_O on 11.09.2017.
 */
public interface IMyString {
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

    void print();
    IMyString concat(IMyString iMyString);
    IMyString toLowerCase();
    IMyString toUpperCase();
    IMyString substring(int start, int end);
    IMyString removeSubstring(int start, int end);
    IMyString removeWhitespaces();

}
