package L03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOdds = 0;
        int sumEvens = 0;
        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEvens += numbers[i];
            } else sumOdds += numbers[i];
        }
        System.out.println(sumEvens - sumOdds);
    }
}
