package Advanced.L05FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class T2SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(", ");

        Function<String, Integer> intNumbers = Integer::parseInt;
        BiFunction<Integer, Integer, Integer> sumNumbers = Integer::sum;

        List<Integer> collect = Arrays.stream(numbers)
                .map(intNumbers::apply)
                .collect(Collectors.toList());

        System.out.println("Count = "+collect.size());
        System.out.println("Sum = "+collect.stream().mapToInt(e->e).sum());

    }
}
