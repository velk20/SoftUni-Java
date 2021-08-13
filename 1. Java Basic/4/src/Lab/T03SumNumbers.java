package Lab;

import java.util.Scanner;

public class T03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (sum < num) {
            int n = Integer.parseInt(scanner.nextLine());
            sum+=n;
        }

        System.out.println(sum);
    }
}
