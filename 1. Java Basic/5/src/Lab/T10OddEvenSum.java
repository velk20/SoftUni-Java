package Lab;

import java.util.Scanner;

public class T10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                even += num;
            } else odd += num;
        }

        if (odd == even) {
            System.out.printf("Yes\nSum = %d",odd);
        }else System.out.printf("No\nDiff = %d",Math.abs(odd-even));
    }
}
