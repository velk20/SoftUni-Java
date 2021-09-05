package L02DataTypesandVariables.MoreExercise;

import java.util.Scanner;

public class T01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//.getClass().getSimpleName()

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            Scanner num = new Scanner(input);
            if (num.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", input);
            } else if (num.hasNextInt()) {
                System.out.printf("%s is integer type%n", input);

            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);

            }
            else if (num.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", input);
            } else if (num.hasNextLine()) {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();

        }
    }
}
