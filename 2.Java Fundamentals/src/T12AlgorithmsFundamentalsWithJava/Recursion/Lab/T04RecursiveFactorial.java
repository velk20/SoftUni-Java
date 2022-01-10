package T12AlgorithmsFundamentalsWithJava.Recursion.Lab;

import java.util.Scanner;

public class T04RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int fact = printFactorial(n);
        System.out.println(fact);
    }

    static int printFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * printFactorial(n - 1);

    }
}
