package ua.artcode.week6.day2.data_structure;

import org.jetbrains.annotations.NotNull;

import java.util.EmptyStackException;
import java.util.Iterator;

public class MyLinkedStack<E> implements MyStack<E> {

    private Node<E> top;
    private int size;

    @Override
    public void push(E e) {
        if (size == 0) {
            top = new Node<E>(e, null);
        } else {
            top = new Node<E>(e, top);
        }
        size++;
    }

    @Override
    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        size--;
        Node<E> temp = top;
        top = top.getNext();
        return temp.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    public E get(int index) {
        if (size == 0) {
            throw new EmptyStackException();
        }
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Iterator<E> iterator = this.iterator();
        for(int i = 0; i < index; i++) {
            iterator.next();
        }
        return iterator.next();
    }

    public boolean set(int index, E newValue) {
        if (size == 0 || index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node<E> tempNode = top;
        for (int i = 0; i < index - 1; i++) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(new Node<E>(newValue, tempNode.getNext().getNext()));
        return true;
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {
        return new MyLinkedStackIterator<E>(top);
    }


    // Stack node class:
    private static class Node<K> {

        private K value;
        private Node<K> next;

        public Node() {
        }

        public Node(K value, Node<K> next) {
            this.value = value;
            this.next = next;
        }

        public K getValue() {
            return value;
        }

        public void setValue(K value) {
            this.value = value;
        }

        public Node<K> getNext() {
            return next;
        }

        public void setNext(Node<K> next) {
            this.next = next;
        }
    }



    // Linked stack iterator:
    private static class MyLinkedStackIterator<M> implements Iterator<M> {

        Node<M> head;

        public MyLinkedStackIterator(Node<M> head) {
            this.head = head;
        }

        @Override
        public boolean hasNext() {
            return head != null;
        }

        @Override
        public M next() {
            if (head != null) {
                M val = head.getValue();
                head = head.getNext();
                return val;
            }
            return null;
        }
    }

}
