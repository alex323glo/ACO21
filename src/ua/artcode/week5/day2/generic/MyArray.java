package ua.artcode.week5.day2.generic;

public class MyArray<T, X> {

    private T[] array;
    private int size;

    public MyArray(int size) {
        array = (T[]) new Object[size];
    }

    public MyArray(T[] array) {
        this.array = array;
    }


    private static void test1() {
//        T el;     // can't do so!
    }


//    private static<X, Z> X testStatic(Z z, X x) {
//        return x;
//    }


    public void test2() {
//        T el = new T();   // can't do so!!!
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void add(T el) {
        if (size == array.length) {
            throw new ArrayStoreException("array is full");
        }
        array[size++] = el;
    }

    public void set(int index, T el) {

    }

    public int indexOf(T el) {
        return -1;
    }

    public int size() {
        return size;
    }

}
