package ua.artcode.week6.day2_java8.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // multiply each element by 2, subtract by 10,
        // leave only even and then print it pretty as String.


        // First variant of solution (traditional):
        /*StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);

            numbers.set(i, numbers.get(i) - 10);

            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            } else {
                builder.append(numbers.get(i)).append(";\n");
            }

        }

        System.out.println(builder.toString());
*/

        // Second variant of solution (new! ; came with Java 8):
        Function<Integer, Integer> multFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };

        Function<Integer, Integer> subsFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer - 10;
            }
        };

        Predicate<Integer> evenPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        Object[] mas = numbers.stream().map(multFunction).map(subsFunction)
                .filter(evenPredicate).toArray();

        System.out.println(Arrays.toString(mas));



        // Third variant of solution ( brand new!!! ; came with Java 8):
        // (lambda - functional interface
        //  lambda - function description (function body) )
        Function<Integer, Integer> minusFunction2 = (Integer a) -> {return a - 10;};
        // ... or smaller:
        Function<Integer, Integer> minusFunction3 = (a) -> (a - 10);    // great!!!

        // Result code:
        Object[] mas1 = numbers.stream().map(a -> a * 2).map(a -> a - 10).filter(num -> num % 2 == 0).toArray();





        // methods of stream:
        //  1) intermediate - middle -> returns Stream (allows continue "chaning")
        //      map -> operating and converting -> Function body
        //      filter -> Predicate
        //      peek -> takes and does some operations (Consumer; no return - no stream changes)
        //      distinct -> leaves only unique elements
        //      limit -> limits by size
        //      skip(count) -> skips <count> of elements
        //      sorted - input Comparator
        //      flatMap - value and function -> generates new Stream!
        //  2) terminal -> don't generate stream
        //      allMatch
        //      anyMatch
        //      count
        //      toArray
        //      forEach
        //      findAny
        //      findFirst
        //      collect -> Stream to Collection, String
        //      reduce -> aggregationFunction from many get one value

        Function<Integer, Stream<Integer>> flatMapper = new Function<Integer, Stream<Integer>>() {
            @Override
            public Stream<Integer> apply(Integer integer) {
//                Streams.Builder<>().add(integer / 2).add(integer / 2)
                return Stream.of(integer / 2, integer % 2);
            }
        };
        // 1:45:
        numbers.stream().flatMap(flatMapper);

    }

}
