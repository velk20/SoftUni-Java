package L01BasicSyntaxStatementsLoops.Lab;

import java.util.Scanner;

public class T0Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d , Grade: %.2f\n",name,age,grade);
        String output = String.format("Name: %s, Age: %d , Grade: %.2f",name,age,grade);
        System.out.println(output);
    }
}
