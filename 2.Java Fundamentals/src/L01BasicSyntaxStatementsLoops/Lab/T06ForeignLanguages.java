package L01BasicSyntaxStatementsLoops.Lab;

import java.util.Scanner;

public class T06ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        switch (n) {
            case "USA", "England" -> System.out.println("English");
            case "Spain", "Argentina", "Mexico" -> System.out.println("Spanish");
            default -> System.out.println("unknown");
        }
    }
}
