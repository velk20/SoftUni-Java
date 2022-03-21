package Advanced.L05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class T03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int min = Arrays.stream(numbers).min().orElse(0);

        Function<List<Integer>, Integer> getMinNumber = Collections::min;

        System.out.println(min);
    }
}
