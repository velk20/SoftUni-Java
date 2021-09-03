package L02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class T04SumofChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char c = scanner.nextLine().charAt(0);
            int a = c;
            sum += a;
        }

        System.out.printf("The sum equals: %d",sum);
    }
}
