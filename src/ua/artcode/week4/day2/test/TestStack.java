package ua.artcode.week4.day2.test;

import ua.artcode.week4.day2.data_structure.common.MyStack;
import ua.artcode.week4.day2.data_structure.dynamic.MyLinkedStack;
import ua.artcode.week4.day2.data_structure.static_struct.MyArrayStack;

public class TestStack {

    public static void main(String[] args) {

        MyStack stack1 = new MyArrayStack(10);
        MyStack stack2 = new MyLinkedStack();

        for (int i = 0; i < 7; i++) {
            stack1.push(i);
        }

        System.out.println(stack1);

        for (int i = 0; i < 7; i++) {
            stack2.push(i);
        }

        System.out.println(stack2);


    }

}
