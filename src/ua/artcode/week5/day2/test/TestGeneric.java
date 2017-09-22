package ua.artcode.week5.day2.test;

import ua.artcode.week5.day2.generic.MyArray;
import ua.artcode.week5.day2.generic.MyContainer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestGeneric {

    public static void main(String[] args) {

        MyContainer<String> stringContainer = new MyContainer<>();

        stringContainer.setElement("bla");
        System.out.println(stringContainer.getElement());

        System.out.println(stringContainer.getElement().getClass().getSimpleName());

        MyContainer container = new MyContainer();
        container.setElement(23);
        // Will cause ClassCastException:
//        Double d = (Double) container.getElement();


        MyArray<Integer, Double> intArray = new MyArray<>(new Integer[10]);


        TestGeneric.<Integer, String>convert(23);


        List list = Arrays.asList(1, 2, 3, 4, "567");
        TestGeneric.iterateOver(new ArrayList<>(list));


        // ? extends Number => Number, Integer, Byte, ...
        // ? super Number => Number, Object, ...
        List<? extends Number> l = Arrays.asList(1, 2, 3, 4);   // takes only Number or its "children" !
        List<? super Number> l1 = Arrays.asList(1, 2, 3, 4);    // takes only Number or its "parents" !
//        List<? extends Integer> l2 = Arrays.asList(1, 2, "3", 4.0d);    // can't do so!
        Object object = l.get(0);


        compare(String.class, "Ivan", "23");

        Comparator comparator = new MyStringComparator();
        System.out.println(compare2("Ivan", 23, comparator));

    }

    public static<T extends Comparable<T>> int compare(Class<T> cl, T c1, T c2) {
        return c1.compareTo(c2);
    }

    public static<E> int compare2(E c1, E c2, Comparator<E> comparator) {
        return comparator.compare(c1, c2);
    }


    public static<X,Z> Z convert(X x) {
        return null;
    }

    public static<T> void iterateOver(ArrayList<?> al) {

        for(Object object: al) {
            System.out.println(object);
        }

    }

    public static class MyStringComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }

}
