package L04Methods.Exercise;

import java.util.Scanner;

public class T03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        printingCharsInRange(a,b);
    }


    public static void printingCharsInRange(char c, char ch) {
        if (c < ch) {
            for (int i = c + 1; i < ch; i++) {
                System.out.printf("%c ", i);
            }
        } else {
            for (int i = ch+1; i < c; i++) {
                System.out.printf("%c ", i);

            }
        }
    }
}
