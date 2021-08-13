package Lab;

import java.util.Scanner;

public class T07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int min = Integer.MAX_VALUE;
        while (!num.equals("Stop")) {
            int n = Integer.parseInt(num);

            if (n < min) {
                min = n;
            }

            num = scanner.nextLine();
        }

        System.out.println(min);
    }
}
