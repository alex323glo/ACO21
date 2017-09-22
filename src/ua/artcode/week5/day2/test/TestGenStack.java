package ua.artcode.week5.day2.test;

import ua.artcode.week4.day2.data_structure.common.MyStack;
import ua.artcode.week4.day2.data_structure.static_struct.MyArrayStack;

import java.util.Iterator;

public class TestGenStack {

    public static void main(String[] args) {

        MyStack<Number> myStack = new MyArrayStack<Number>(10);
//        myStack.push();

        Iterator<Number> iterator = myStack.iterator();
        iterator.next();



    }

}
