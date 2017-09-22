package ua.artcode.week5.day2.generic;

public class MyContainer<T> {

    private T element;

    public MyContainer() {
    }

    public MyContainer(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
