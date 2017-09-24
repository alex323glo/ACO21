package ua.artcode.week4.day2.data_structure.static_struct;

import ua.artcode.week4.day2.data_structure.common.MyStack;

import java.util.Iterator;

public class MyArrayStack<E> implements MyStack<E>, Iterable<E> {

    private E[] arr;
    private int top;

    public MyArrayStack(int size) {
        arr = (E[]) new Object[size];
    }

    @Override
    public void push(E e) {

        if (top == arr.length) {
            System.out.println("Stack is full!");
            return;
        }

        arr[top++] = e;
    }

    @Override
    public E pop() {
        if (top == 0) {
            System.out.println("Stack is empty!");
            return null;
        }

        E temp = arr[--top];
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


    // (from week5_day1 !!!)
    @Override
    public Iterator<E> iterator() {
        return new MyArrayStackIterator<E>(arr, top);
    }


    // (from week5_day1 !!!)
    // nested class:    (better to use inner!)
    public static class MyArrayStackIterator<G> implements Iterator<G> {

        private G[] arr;
        private int curr;

        public MyArrayStackIterator(G[] arr, int top) {
            this.arr = arr;
            curr = top - 1;
        }

        @Override
        public G next() {
            return arr[curr--];
        }

        @Override
        public boolean hasNext() {
            return curr >= 0;
        }

    }


}
