package ua.artcode.week2.day2.comp;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class TestArrays {

    public static void main(String[] args) {

        int[] mas = {25, 3, -4, 5, 96, 7};

        int[] cloned = Arrays.copyOf(mas, mas.length);
        int[] rangeCloned = Arrays.copyOfRange(mas, 0, 2);

        Arrays.equals(mas, cloned);

        String strMas = Arrays.toString(mas);

        int[] newArr = new int[10];
        Arrays.fill(newArr, 2);

        System.out.println(strMas);
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));


        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Vaska", 7, 5);
        cats[1] = new Cat("Murchik", 2, 7);
        cats[2] = new Cat("Rizik", 8, 2);
        cats[3] = new Cat("Cote", 3, 15);
        cats[4] = new Cat("Bonia", 9, 3);

        Object[] m = cats;

        Arrays.sort(m);
        String res = Arrays.toString(m);
        res = res.replaceAll("},", "};\n");

        System.out.println(res);

        System.out.println("----------------------------");

        Arrays.sort(cats, new CatAgeComparator());
        System.out.println(Arrays.toString(cats).replaceAll("},", "};\n"));
        Arrays.sort(cats, new CatWeightComparator());
        System.out.println(Arrays.toString(cats).replaceAll("},", "};\n"));
        Arrays.sort(cats, new CatPatNameComparator());
        System.out.println(Arrays.toString(cats).replaceAll("},", "};\n"));
    }

}


class Cat implements Comparable {

    // Fields and properties:
    private String patName;
    private double weight;
    private int age;

    // Constructor:
    public Cat(String patName, double weight, int age) {
        this.patName = patName;
        this.weight = weight;
        this.age = age;
    }

    // Getters and setters:
    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Override methods:
    @Override
    public String toString() {
        return "Cat{" +
                "patName='" + patName + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Cat anotherCat = (Cat) o;
        return this.age - anotherCat.age;
    }
}

class CatPatNameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cat c1 = (Cat) o1;
        Cat c2 = (Cat) o2;

        return c1.toString().compareTo(c2.toString());
    }

}

class CatAgeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cat c1 = (Cat) o1;
        Cat c2 = (Cat) o2;

        return c1.getAge() - c2.getAge();
    }

}

class CatWeightComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cat c1 = (Cat) o1;
        Cat c2 = (Cat) o2;

        return c1.getWeight() > c2.getWeight() ? 1 : (c1.getWeight() < c2.getWeight() ? -1 : 0);
    }

}
