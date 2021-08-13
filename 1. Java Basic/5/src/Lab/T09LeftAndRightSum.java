package Lab;

import java.util.Scanner;

public class T09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());


                left += num;

        } for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());


                right += num;

        }

        if (left == right) {
            System.out.printf("Yes, sum = %d",left);
        }else System.out.printf("No, diff = %d",Math.abs(left-right));
    }
}
