package ua.artcode.additional.acp11.week3.day1;

public class MyArray<E> implements IMyArray<E> {

    public static final int DEFFAULT_ARRAY_LENGTH = 100;
    private E[] array;
    private int size;

    public MyArray() {
        array = (E[]) new Object[DEFFAULT_ARRAY_LENGTH];
    }

    public MyArray(int length) {
        array = (E[]) new Object[length];
    }

    public MyArray(E[] array) {

        if (array != null) {
            this.array = array;
        } else {
            this.array = (E[]) new Object[DEFFAULT_ARRAY_LENGTH];
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int maxSize() {
        return array.length;
    }

    @Override
    public void set(E e, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = e;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public boolean addLast(E e) {
        if (size == array.length) {
            return false;
        }

        array[size++] = e;
        return true;
    }

    @Override
    public E removeLast() {
        if (size < 1) {
            return null;
        }
        return array[--size];
    }
}
