package L01BasicSyntaxStatementsLoops.Exercise;

import java.util.Scanner;

public class T05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        String correctPass = "";
        int counter = 0;
        for (int i = pass.length()-1; i >= 0; i--) {
            char digit = pass.charAt(i);
            correctPass += "" + digit;

        }

        String input = scanner.nextLine();
        while (!input.equals(correctPass)) {
            if (counter < 3) {
                System.out.println("Incorrect password. Try again.");
                counter++;
                input = scanner.nextLine();

            } else {
                System.out.println("User sunny blocked!");
                break;
            }
        }

        if (input.equals(correctPass)) {
            System.out.printf("User %s logged in.", pass);
        }
    }
}
