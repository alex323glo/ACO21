package ua.artcode.week7.day2.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Ivan");
        map.put(2, "Petro");
        System.out.println("Was replaced: " + map.put(1, "Alex"));

        map.isEmpty();
        System.out.println("contains key=2 : " + map.containsKey(2) +
            "\ncontains key=3 : " + map.containsKey(3));

        System.out.println("contains val=\"Petro\" : " + map.containsValue("Petro") +
            "\ncontains val=\"Sergiy\" : " + map.containsValue("Sergiy"));

        System.out.println("get(1): " + map.get(1));

        System.out.println("Removed: " + map.remove(1));


        map.put(14, "fourteen (14)");
        map.put(10, "ten (10)");
        map.put(15, "fifteen (15)");
        map.put(11, "eleven (11)");
        map.put(13, "thirteen (13)");
        map.put(12, "twelve (12)");


        // how to iterate:
        System.out.println("\nIteration:");
        // 1.
        System.out.println(" - Method 1:");
        Set<Integer> keys = map.keySet();
        for (Integer key: keys) {
            System.out.printf("key: %s, value: %s\n", key, map.get(key));
        }

        // 2.
        System.out.println(" - Method 2:");
        Collection<String> values = map.values();
        for (String value: values) {
            System.out.printf("value: %s\n", value);
        }

        // 3.
        System.out.println(" - Method 3:");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        entrySet.forEach(
                n -> System.out.printf("key: %s, value: %s\n", n.getKey(), n.getValue())
        );

    }

}
