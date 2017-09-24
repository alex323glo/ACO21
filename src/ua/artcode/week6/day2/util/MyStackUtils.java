package ua.artcode.week6.day2.util;

import ua.artcode.week6.day2.data_structure.MyLinkedStack;
import ua.artcode.week6.day2.data_structure.MyStack;

public class MyStackUtils {

    public static<T> MyStack<T> generate(T... values) {
        MyStack<T> stack = new MyLinkedStack<T>();
        if (values == null || values.length < 1) {
            return stack;
        }

        for (T element: values) {
            stack.push(element);
        }

        return stack;
    }

}
