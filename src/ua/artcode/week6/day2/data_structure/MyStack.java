package ua.artcode.week6.day2.data_structure;

public interface MyStack<T> extends Iterable<T> {

    void push(T t);
    T pop();
    int size();

}
