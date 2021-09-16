package L01BasicSyntaxStatementsLoops.MoreExercise;

import java.util.Scanner;

public class T00Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String output = "";
        while (counter != num) {

            int n = Integer.parseInt(scanner.nextLine());
            if (n != 0) {

                String len = "" + n;
                int numberOfDigits = len.length();
                int mainDigit = n % 10;
                int offSet = 0;
                if (mainDigit == 8 || mainDigit == 9) {

                    offSet = ((mainDigit - 2) * 3) + 1;
                } else {
                    offSet = ((mainDigit - 2) * 3);

                }

                int letterIndex = (offSet + numberOfDigits - 1);
                char a = Character.valueOf((char) (97 + letterIndex));
                output += "" + a;
            } else {
                output += " ";

            }
            counter++;
        }
        System.out.println(output);

    }
}
