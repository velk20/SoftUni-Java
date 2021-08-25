package L01BasicSyntaxStatementsLoops.Lab;

import java.util.Scanner;

public class T09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
                n--;
            }
            if (n == 0) {
                System.out.printf("Sum: %d",sum);
                break;
            }
        }
    }
}
