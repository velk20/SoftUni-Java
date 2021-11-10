package L08TextProcessing.Lab;

import java.util.Scanner;

public class T05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        StringBuilder input = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else if (Character.isLetter(ch)) {
                letters.append(ch);
            } else symbols.append(ch);
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
