package L04Methods.Exercise;

import java.util.Scanner;

public class T09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            palindrome(input);

            input = scanner.nextLine();
        }
    }

    public static void palindrome(String n) {
        String reverseString = "";

        for (int i = n.length()-1; i >=0 ; i--) {
            char ch = n.charAt(i);
            reverseString += "" + ch;

        }

        if (reverseString.equals(n)) {
            System.out.println("true");

        }else System.out.println("false");
    }
}
