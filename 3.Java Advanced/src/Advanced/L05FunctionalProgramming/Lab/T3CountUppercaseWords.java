package Advanced.L05FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class T3CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Predicate<String> isUpperCase = e -> Character.isUpperCase(e.charAt(0));

        List<String> collect = Arrays.stream(words)
                .filter(isUpperCase)
                .collect(Collectors.toList());

        System.out.println(collect.size());
        collect.forEach(System.out::println);

    }
}
