package Advanced.L05FunctionalProgramming.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class T04AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        IntUnaryOperator add = e -> e + 1;
        IntUnaryOperator multy = e -> e * 2;
        IntUnaryOperator sub = e -> e - 1;

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            switch (input) {
                case "add":
                    nums = Arrays.stream(nums).map(add).toArray();
                    break;
                case "multiply":
                    nums = Arrays.stream(nums).map(multy).toArray();
                    break;

                    case "subtract":
                    nums = Arrays.stream(nums).map(sub).toArray();
                    break;


                    case "print":
                        Arrays.stream(nums).forEach(e -> System.out.printf("%d ", e));
                        System.out.println();
                    break;
            }
            input = scanner.nextLine();
        }




    }
}
