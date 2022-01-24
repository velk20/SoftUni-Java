package Advanced.L05FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        strings.add("13");
        strings.add("45");
        strings.add("64");
        strings.add("69");
        strings.add("78");

        //end the stream -> terminal collect, forEach, sum;

        //IntStream(Stream of ints) -> sum(); toArray(); average()

        //Stream<Integer> (Stream of Integers) -> collector.ToList();

        //1.Function<I,R> Interface (input and output types) .apply()
        Function<String, Integer> numByTwo = n -> Integer.parseInt(n) * 2;
        Function<Integer, Integer> sumByTwo = n -> n * 2;
        String a = "2";
        System.out.println(numByTwo.apply(a));

        //2.Consumer<T> is void interface (only input type) .accept()
        Consumer<String> printer = str -> System.out.println(str.charAt(0));
        printer.accept("Hello");

        //3.Supplier<T> only have return type (no input type) .get()
        Supplier<Integer> getRandomInt = () -> new Random().nextInt(69);
        int num = getRandomInt.get();

        //4.Predicate<T> return always boolean (only input type) .test()
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(69));

        //5.UnaryOperator (input and output are the same TYPE (2))
        Function<Double, Double> addVAT = e -> 1.2 * e;
        UnaryOperator<Double> addVATUnary = e -> 1.2 * e;

        //5.1BinaryOperator (input and output are the same TYPE (3))

        //BI FUNCTIONS

        //6.BiFunction <T,I,R> (T and I are input types R is return type)
        //7.BiConsumer <T,U>
        BiConsumer<String, Integer> print = ( name,  age) ->
                System.out.printf("%s is %d years old\n", name, age);
    }
}
