package L02DataTypesandVariables.Lab;

import java.util.Scanner;

public class T02PoundstoDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.3f", n * 1.31);
    }
}
