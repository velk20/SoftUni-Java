package L01BasicSyntaxStatementsLoops;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int b = n % 6;
        System.out.println(b);
    }
}
