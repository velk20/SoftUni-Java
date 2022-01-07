package T12AlgorithmsFundamentalsWithJava.Recursion.Lab;

import java.util.Scanner;

public class T02RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        drawRecursion(n);
    }

    private static void drawRecursion(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        drawRecursion(n-1);
        for (int i = 0; i < n; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
