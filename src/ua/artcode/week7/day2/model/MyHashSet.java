package ua.artcode.week7.day2.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

    // TODO: finish MyHashSet<E> !

public class MyHashSet<E> implements Set<E> {

    private static final int DEFAULT_TABLE_CAPACITY = 16;

    private Node[] table;
    private int size;

    public MyHashSet() {
        table = (Node[]) new Object[DEFAULT_TABLE_CAPACITY];
    }

    public MyHashSet(int capacity) {
        if (capacity < DEFAULT_TABLE_CAPACITY) {
            table = (Node[]) new Object[DEFAULT_TABLE_CAPACITY];
        }
        table = (Node[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            return false;
        }

        int position = getPosition(o);

        if (table[position] == null) {
            return false;                   // If this table position is empty.
        }


        Node temp = table[position];        // If this table position is not empty,
        while (temp != null) {              // we run through its nodes.
            if (temp.value.equals(o)) {
                return true;                // If we find equal element to searched.
            }
            temp = temp.next;
        }

        return false;                       // If we don't find equal element to searched.
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {

        int hash = Math.abs(e.hashCode());
        int position = hash % table.length;

        if (table[position] == null) {
            table[position] = new Node(e, null);    // If this position in table is empty.
        } else {
            Node temp = table[position];        // If this position in table is not empty,
            Node last = temp;                   // we run through its nodes.

            while (temp != null) {
                if (temp.value.equals(e)) {
                    return false;           // If there already is equal element to new one.
                }

                last = temp;
                temp = temp.next;
            }

            last.next = new Node(e, null);      // if there is no equal element to new one.
        }

        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    private int getPosition(Object o) {
        return Math.abs(o.hashCode()) % table.length;
    }

    // Hash set node class:
    private class Node {

        E value;
        Node next;

        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }


    // Hash set iterator class:


}
