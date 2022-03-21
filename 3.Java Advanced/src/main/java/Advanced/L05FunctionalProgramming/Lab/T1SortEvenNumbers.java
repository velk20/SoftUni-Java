package Advanced.L05FunctionalProgramming.Lab;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class T1SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(", ");

        List<String> list = Arrays
                .stream(numbers)
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(String.join(", ",list));

        list = list.stream()
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(String.join(", ",list));


    }
}
