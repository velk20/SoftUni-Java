package Exercise;

import java.util.Scanner;

public class T05DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num%2 == 0) {
                count2++;
            }if (num % 3 == 0) {
                count3++;
            } if (num % 4 == 0) {
                count4++;
            }
        }

        System.out.printf("%.2f%%\n", (double)count2 / n * 100.0);
        System.out.printf("%.2f%%\n", (double)count3 / n * 100.0);
        System.out.printf("%.2f%%\n", (double)count4 / n * 100.0);
    }
}
