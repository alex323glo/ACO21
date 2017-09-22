package ua.artcode.week5.day1.test;

import ua.artcode.week4.day2.data_structure.static_struct.MyArrayStack;

import java.util.Iterator;


public class TestMyArrayStackIterator {

    public static void main(String[] args) {

        MyArrayStack myArrayStack = new MyArrayStack(10);
        myArrayStack.push(1);
        myArrayStack.push(2);
        myArrayStack.push(3);
        myArrayStack.push(4);

        Iterator iterator = myArrayStack.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Object obj: myArrayStack) {
            System.out.println(obj);
        }
    }

}
