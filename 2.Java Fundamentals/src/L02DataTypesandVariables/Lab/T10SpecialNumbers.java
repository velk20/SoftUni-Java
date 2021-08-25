package L02DataTypesandVariables.Lab;

import java.util.Scanner;

public class T10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int surr = i;
            while (i != 0) {
                int digit = i % 10;
                sum += digit;
                i = i / 10;

            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True\n", surr);
            } else {
                System.out.printf("%d -> False\n", surr);

            }
            sum = 0;
            i = surr;
        }
    }
}
