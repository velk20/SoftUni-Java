package Lab;

import java.util.Scanner;

public class T06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        while (!num.equals("Stop")) {
            int n = Integer.parseInt(num);

            if (n > max) {
                max = n;
            }

            num = scanner.nextLine();
        }

        System.out.println(max);
    }
}
