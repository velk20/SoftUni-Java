package L02DataTypesandVariables.Exercise;

import java.util.Scanner;
import java.math.*;

public class T02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //!!!!  WITH STRINGS !!!!
//        String a = scanner.nextLine();
//        int sum = 0;
//        for (int i = 0; i < a.length(); i++) {
//            char digit = a.charAt(i);
//        int dig = Integer.parseInt(String.valueOf(digit));
//            int dig2 = Character.getNumericValue(digit);
//            sum += dig;
//
//        }
//        System.out.printf("%d",sum);

        //!!! WITH % ostatuk (poslednata cifra na chisloto) from EXERCISES
        int number = Integer.parseInt(scanner.nextLine());

        int lenghtOfNumber = String.valueOf(number).length();
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10; // number/=10;

        }
        System.out.println(sum);

    }
}
