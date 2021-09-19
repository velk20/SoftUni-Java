package L02DataTypesandVariables.MoreExercise;

import java.util.Scanner;

public class T06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int openBracketCounter = 0;
        int closeBracketCounter = 0;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                openBracketCounter++;

            } else if (input.equals(")")) {
                closeBracketCounter++;
                if (openBracketCounter -closeBracketCounter != 0) {
                    System.out.println("UNBALANCED");
                    return;


                }
            }


        }


            if (openBracketCounter == closeBracketCounter) {
                System.out.println("BALANCED");
            } else System.out.println("UNBALANCED");


    }
}
