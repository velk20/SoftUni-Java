package L04Methods.Lab;

import java.util.Scanner;

public class T10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        evenByOdds(Integer.parseInt(scanner.nextLine()));
    }

    public static void evenByOdds(int n) {
        if (n >= 0) {
            String num = "" + n;
            int evenSum = 0;
            int oddSum = 0;
            for (int i = 0; i < num.length(); i++) {
                int let = Integer.parseInt(String.valueOf(num.charAt(i)));
                if (let % 2 == 0) {
                    evenSum += let;
                } else oddSum += let;
            }
            System.out.println(evenSum * oddSum);

        } else {
            String num = "" + n;
            int evenSum = 0;
            int oddSum = 0;
            for (int i = 1; i < num.length(); i++) {
                int let = Integer.parseInt(String.valueOf(num.charAt(i)));
                if (let % 2 == 0) {
                    evenSum += let;
                } else oddSum += let;
            }
            System.out.println(evenSum * oddSum);
        }
    }

}
