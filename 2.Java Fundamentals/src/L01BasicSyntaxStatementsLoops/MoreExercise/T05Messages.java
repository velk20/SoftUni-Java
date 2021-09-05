package L01BasicSyntaxStatementsLoops.MoreExercise;

import java.util.Scanner;

public class T05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String output = "";
        for (int i = 0; i < n; i++) {
            String num = scanner.nextLine();
            int len = num.length();

                char dig = num.charAt(0);
                int mainDigit = Character.getNumericValue(dig);
            int offset = 0;
            if (mainDigit == 8 || mainDigit == 9) {
                 offset = ((mainDigit - 2) * 3) + 1;

            } else {

                 offset = (mainDigit - 2) * 3;
            }

            int index = (offset + len - 1);
            if (mainDigit == 0) {
                output += " ";
            } else {
                output += (char) (index + 97);
            }
        }
        System.out.println(output);
    }
}
