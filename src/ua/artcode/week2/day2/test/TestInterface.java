package ua.artcode.week2.day2.test;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class TestInterface {

    public static void main(String[] args) {
        A a = new Con();
        a.a();

        B b = new Con();
        b.a();
    }

}

interface A {

    void a();

}

interface B {

    void a();

}

class Con implements A, B {

    @Override
    public void a() {

    }

}