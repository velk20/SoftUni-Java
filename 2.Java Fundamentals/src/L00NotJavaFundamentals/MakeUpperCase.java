package L00NotJavaFundamentals;

import java.util.Locale;
import java.util.Scanner;
///Write a function which converts the input string to uppercase.
public class MakeUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.printf("%s",input.toUpperCase(Locale.ROOT));
    }
}
