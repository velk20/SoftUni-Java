package OOP.L08ExceptionsAndErrorHandling.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T01NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int start = range[0];
        int end = range[1];

        System.out.printf("Range: [%d...%d]%n", start, end);
        int validNumber = inputNumber(scanner, start, end);
        System.out.println("Valid number: "+validNumber);
    }

    private static int inputNumber(Scanner scanner, int start, int end) {
        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number >= start && number <= end) {
                    return number;
                } else {
                    System.out.println("Invalid number: " + number);

                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + input);
            }
        }
    }
}
