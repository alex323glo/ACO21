package ua.artcode.week5.test;

import ua.artcode.week4.day2.data_structure.common.MyStack;
import ua.artcode.week4.day2.data_structure.dynamic.MyLinkedStack;
import ua.artcode.week5.iter.MyIterator;

public class TestInner {

    public static void main(String[] args) {
        MyLinkedStack myLinkedStack = new MyLinkedStack();

        MyLinkedStack.MyLinkedStackIterator iterator =
                myLinkedStack. new MyLinkedStackIterator();


        // Used in common:
        MyIterator iterator1 = myLinkedStack.iterator();
    }

}
