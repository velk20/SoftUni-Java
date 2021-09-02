package L02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class T02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            char digit = a.charAt(i);
            int dig = Character.getNumericValue(digit);
            sum += dig;

        }
        System.out.printf("%d",sum);

    }
}
