package L01BasicSyntaxStatementsLoops.Lab;

import java.util.Scanner;

public class T02Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        if (grade >= 3.00) {
            System.out.println("Passed!");
        }
    }
}
