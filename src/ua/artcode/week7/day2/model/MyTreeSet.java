package ua.artcode.week7.day2.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MyTreeSet<E> implements Set<E> {

    private TreeNode<E> root;
    private int size;

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

        Comparable<E> comparable = (Comparable<E>) o;

        return findNode(root, comparable) != null;
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
    public boolean add(E e) {       // make add(E) method more pretty (not so huge) !

        if (e == null) {
            return false;
        }

        if (root == null) {
            root = new TreeNode<>(e, null, null, null);
            size++;
            return true;
        }

        Comparable<E> forCompare = (Comparable<E>) e;

        TreeNode<E> temp = root;
        int compareRes = 0;
        while (true) {

            compareRes = forCompare.compareTo(temp.value);
            if (compareRes < 0) {

                if (temp.left == null) {
                    temp.left = new TreeNode<>(e, temp, null, null);
                    size++;
                    return true;
                }
                temp = temp.left;

            } else if (compareRes > 0) {

                if (temp.right == null) {
                    temp.right = new TreeNode<>(e, temp, null, null);
                    size++;
                    return true;
                }
                temp = temp.right;

            } else {

                return false;
            }

        }

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
        root = null;
        size = 0;
    }


    private TreeNode<E> findNode(TreeNode<E> current, Comparable<E> value) {
        if (current == null) {
            return null;
        }

        if (value.compareTo(current.value) < 0) {
            return findNode(current.left, value);
        } else if (value.compareTo(current.value) > 0) {
            return findNode(current.right, value);
        } else {
            return current;
        }
    }

    // Tree set node (tree node):
    private static class TreeNode<T> {
        T value;
        TreeNode<T> parent;
        TreeNode<T> left;
        TreeNode<T> right;

        public TreeNode(T value, TreeNode<T> parent, TreeNode<T> left, TreeNode<T> right) {
            this.value = value;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }

}
