package L01BasicSyntaxStatementsLoops.Exercise;

import java.util.Scanner;

public class T06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        int fact = 1;
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char n = input.charAt(i);
            String na = "" + n;

            int digit = Integer.parseInt(na);
            for (int j = 1; j <= digit; j++) {
                fact = fact * j;
            }
            sum += fact;
            fact = 1;
        }

        if (num == sum) {
            System.out.println("yes");

        } else {
            System.out.printf("no");
        }
    }
}
