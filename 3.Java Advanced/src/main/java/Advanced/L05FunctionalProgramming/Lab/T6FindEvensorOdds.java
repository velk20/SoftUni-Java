package Advanced.L05FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class T6FindEvensorOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bound = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        final String oddOrEven = scanner.nextLine();
        List<Integer> list = new ArrayList<>();

        for (int i = bound[0]; i <= bound[1]; i++) {
            list.add(i);
        }

        Predicate<Integer> evenOrOdd;
        if (oddOrEven.equals("even")) {
            evenOrOdd = e -> e % 2 == 0;
        } else {
            evenOrOdd = e -> e % 2 != 0;
        }

        list.stream()
                .filter(evenOrOdd)
                .forEach(e->System.out.printf("%d ",e));

    }
}
