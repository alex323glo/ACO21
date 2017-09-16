package ua.artcode.week4.day2.data_structure.static_struct;

import ua.artcode.week4.day2.data_structure.common.MyStack;

import java.util.Arrays;

public class MyArrayStack implements MyStack {

    private Object[] arr;
    private int top;

    public MyArrayStack(int size) {
        arr = new Object[size];
    }

    @Override
    public void push(Object object) {

        if (top == arr.length) {
            System.out.println("Stack is full!");
            return;
        }

        arr[top++] = object;
    }

    @Override
    public Object pop() {
        if (top == 0) {
            System.out.println("Stack is empty!");
            return null;
        }

        Object temp = arr[--top];
        arr[top] = null;
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");

        for (int i = top - 1; i >= 0; i--) {
            sb.append(arr[i]).append("\n");
        }

        return "MyArrayStack{\n" +
                sb +
                '}';
    }
}
