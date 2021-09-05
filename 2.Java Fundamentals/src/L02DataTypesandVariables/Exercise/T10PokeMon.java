package L02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class T10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int count = 0;
        long originalValue = n;
        while (n >= m) {
            count++;
            n -= m;
            if (originalValue / 2.0 == n) {
                if (y > 0) {

                    n /= y;
                }

            }
        }
        System.out.println(n);
        System.out.println(count);

    }
}
