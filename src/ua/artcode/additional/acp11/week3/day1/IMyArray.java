package ua.artcode.additional.acp11.week3.day1;

public interface IMyArray<T> {

    int size();

    int maxSize();

    void set(T t, int index);

    T get(int index);

    boolean addLast(T t);

    T removeLast();

}
