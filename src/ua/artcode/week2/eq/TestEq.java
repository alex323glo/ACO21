package ua.artcode.week2.eq;

import java.util.Arrays;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class TestEq {

    public static void main(String[] args) {
        String s1 = new String("1234");
        String s2 = new String("1234");

        System.out.println("s1 == s2 ?      - " + (s1 == s2));
        System.out.println("s1.equals(s2) ? - " + s1.equals(s2));

        Dog dog1 = new Dog("Barsik", 7, new int[]{1,2,3,4,5});
        Dog dog2 = new Dog("Barsik", 7, new int[]{1,2,3,4,5});

        System.out.println("dog1 == dog2 ? - " + (dog1 == dog2));
        System.out.println("dog1.equals(dog2) ? - " + dog1.equals(dog2));



        // 1. Reflection:
        //      dog1.equals(dog1) ->
        // 2. Symmetric:
        //      dog1.equals(dog2) == dog2.equals(dog1)
        // 3. Transitiveness:
        //      x == y && y == z -> x == z
        // 4. x == null -> false
    }

}

class Dog {

    // Fields and properties:
    private String name;
    private int age;
    private int[] bones;

    // Constructors:
    public Dog() {
    }

    public Dog(String name, int age, int[] bones) {
        this.name = name;
        this.age = age;
        this.bones = bones;
    }

    // Getters and setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getBones() {
        return bones;
    }

    public void setBones(int[] bones) {
        this.bones = bones;
    }

    // Overrides:
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bones=" + Arrays.toString(bones) +
                '}';
    }


    // x == x -> true
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Dog anotherDog = (Dog) obj;

        return (name != null && anotherDog.name != null && name.equals(anotherDog.name)) &&
                age == anotherDog.age &&
                Arrays.equals(bones, anotherDog.bones);
    }
}
