package ua.artcode.week5.test;

import ua.artcode.week4.day2.data_structure.common.MyStack;
import ua.artcode.week4.day2.data_structure.dynamic.MyLinkedStack;
import ua.artcode.week5.iter.MyIterator;

public class TestMyLinkedStackIterator {

    public static void main(String[] args) {
        MyLinkedStack myStack = new  MyLinkedStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        MyIterator iterator = myStack.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // possible variant:
        for (Object obj: myStack) {
            System.out.println(obj);
        }
    }

}
