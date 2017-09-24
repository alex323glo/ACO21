package ua.artcode.week6.day2.test;

import ua.artcode.week6.day2.data_structure.MyLinkedStack;
import ua.artcode.week6.day2.util.MyStackUtils;

import java.util.EmptyStackException;

public class TestMyLinkedStack {

    public static void main(String[] args) {

        testIntegerStack();

        testStringStack();

    }

    private static void testIntegerStack() {
        System.out.println("__________testIntegerStack__________");

//        MyLinkedStack<Integer> integerStack = new MyLinkedStack<>();
//        integerStack.push(1);
//        integerStack.push(2);
//        integerStack.push(3);
//        integerStack.push(4);
        MyLinkedStack<Integer> integerStack = (MyLinkedStack<Integer>) MyStackUtils
                .generate(1, 2, 3, 4);

        System.out.println("size: " + integerStack.size() +
                ", stack(0): " + integerStack.get(0) +
                ", stack(3): " + integerStack.get(3));

        System.out.println("Full integerStack:");
        for (Integer element : integerStack) {
            System.out.println(element);
        }

        try {
            integerStack.get(5);
            System.out.println("Here must be IndexOutOfBoundsException!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Success! IndexOutOfBoundsException was caught!");
        }

        System.out.println("pop() = " + integerStack.pop());
        System.out.println("pop() = " + integerStack.pop());
        System.out.println("pop() = " + integerStack.pop());
        System.out.println("pop() = " + integerStack.pop());

        try {
            integerStack.pop();
            System.out.println("Here must be EmptyStackException!");
        } catch (EmptyStackException ese) {
            System.out.println("Success! EmptyStackException was caught!");
        }

        try {
            integerStack.get(0);
            System.out.println("Here must be EmptyStackException!");
        } catch (EmptyStackException ese) {
            System.out.println("Success! EmptyStackException was caught!");
        }

        System.out.println("------------------------------------");
    }

    private static void testStringStack() {
        System.out.println("__________testStringStack___________");

//        MyLinkedStack<String> stringStack = new MyLinkedStack<>();
//        stringStack.push("one");
//        stringStack.push("two");
//        stringStack.push("three");
//        stringStack.push("four");
        MyLinkedStack<String> stringStack = (MyLinkedStack<String>) MyStackUtils
                .generate("one", "two", "three", "four");

        System.out.println("size: " + stringStack.size() +
                ", stack(0): " + stringStack.get(0) +
                ", stack(3): " + stringStack.get(3));

        System.out.println("Full stringStack:");
        for (String str : stringStack) {
            System.out.println(str);
        }

        try {
            stringStack.get(5);
            System.out.println("Here must be IndexOutOfBoundsException!");
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Success! IndexOutOfBoundsException was caught!");
        }

        System.out.println("pop() = " + stringStack.pop());
        System.out.println("pop() = " + stringStack.pop());
        System.out.println("pop() = " + stringStack.pop());
        System.out.println("pop() = " + stringStack.pop());

        try {
            stringStack.pop();
            System.out.println("Here must be EmptyStackException!");
        } catch (EmptyStackException ese) {
            System.out.println("Success! EmptyStackException was caught!");
        }

        try {
            stringStack.get(0);
            System.out.println("Here must be EmptyStackException!");
        } catch (EmptyStackException ese) {
            System.out.println("Success! EmptyStackException was caught!");
        }

        System.out.println("------------------------------------");
    }

}
