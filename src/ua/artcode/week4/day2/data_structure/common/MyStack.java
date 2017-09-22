package ua.artcode.week4.day2.data_structure.common;

import java.util.Iterator;

public interface MyStack<T> extends Iterable<T> {

    // add to tail
    void push(T t);

    // remove from tail
    T pop();

    // (from week5_day1)
    Iterator<T> iterator();

}
