package ua.artcode.week2.day2.obj;

import ua.artcode.week2.day1.model.Coder;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class TestObject {

    public static void main(String[] args) {
        SomeClass someObject = new SomeClass();
        System.out.println("SomeClass instance is-a Object. - " + (someObject instanceof Object));

        Coder coder = new Coder();
        testObj(coder);
    }

    public static void testObj(Object object) {
        System.out.println(object.toString());
        System.out.println(object);
    }

}

class SomeClass {

    public void someMethod() {

    }

}
