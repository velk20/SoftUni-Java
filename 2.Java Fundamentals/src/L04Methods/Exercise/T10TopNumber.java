package L04Methods.Exercise;

import java.util.Scanner;

public class T10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        topNumber(n);
    }

    public static void topNumber(int n) {

        for (int i = 1; i <= n; i++) {
            String snum = "" + i;
            int sumOfDigits = 0;
            int counterOfOddDigits = 0;
            for (int j = 0; j < snum.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(snum.charAt(j)));
                if (digit % 2 != 0) {
                    counterOfOddDigits++;
                }
                sumOfDigits += digit;
            }
            if (sumOfDigits % 8 == 0 && counterOfOddDigits >= 1) {
                System.out.println(i);
            }

        }
    }
}
