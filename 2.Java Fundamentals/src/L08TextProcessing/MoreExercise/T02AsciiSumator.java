package L08TextProcessing.MoreExercise;

import java.util.Scanner;

public class T02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startChar = scanner.nextLine().charAt(0);
        char endChar = scanner.nextLine().charAt(0);
        char[] string = scanner.nextLine().toCharArray();
        int sum = 0;
        for (int i = 0; i < string.length; i++) {
            char currentChar = string[i];
            if (startChar < currentChar && currentChar < endChar) {
                sum += currentChar;
            }
        }
        System.out.println(sum);
    }
}
