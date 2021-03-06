package ua.artcode.week5.day1.test;

import ua.artcode.week4.day2.data_structure.static_struct.MyArrayStack;

import java.util.Iterator;

public class TestNested {

    public static void main(String[] args) {
        // Not required creating MyArrayStack to create MyArrayStackIterator:
        MyArrayStack arrayStack = new MyArrayStack(10);

        MyArrayStack.MyArrayStackIterator iterator =
                new MyArrayStack.MyArrayStackIterator(null, 1);


        // Used in common:
        Iterator iterator1 = arrayStack.iterator();
    }

}
