package L04Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class T04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (sixToTenCharacters(input) && lettersOrDigitsOnly(input) && atLeastTwoDigits(input)) {
            System.out.println("Password is valid");
        } else  {
            if (!sixToTenCharacters(input)) {
                System.out.println("Password must be between 6 and 10 characters");
            } if (!lettersOrDigitsOnly(input)) {
                System.out.println("Password must consist only of letters and digits");
            } if (!atLeastTwoDigits(input)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    public static boolean sixToTenCharacters(String input) {
        if (input.length() >= 6 && input.length() <= 10) {
            return true;
        }else return false;
    }

    public static boolean lettersOrDigitsOnly(String input) {
        boolean flag = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                flag =true;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                flag = true;
            } else {
                flag= false;
                break;
            }

        }
        return  flag;
    }

    public static boolean atLeastTwoDigits(String input) {
        int counterOfDigits = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 48 && ch <= 57) {
                counterOfDigits++;
            }
        }
        if (counterOfDigits >= 2) {
            return true;
        } else return false;
    }
}
