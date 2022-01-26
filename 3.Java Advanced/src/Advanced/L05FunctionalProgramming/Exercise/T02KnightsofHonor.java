package Advanced.L05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class T02KnightsofHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");

        Arrays.stream(names).forEach(e->System.out.printf("Sir %s\n",e));

    }
}
