package L08TextProcessing.Exercise;

import java.util.Scanner;

public class T04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stringBuilder.append((char) (ch+3));
        }
        System.out.println(stringBuilder);
    }
}
