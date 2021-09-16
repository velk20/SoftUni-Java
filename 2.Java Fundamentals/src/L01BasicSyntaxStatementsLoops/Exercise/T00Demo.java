package L01BasicSyntaxStatementsLoops.Exercise;

import java.util.Scanner;

public class T00Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
    }
}
