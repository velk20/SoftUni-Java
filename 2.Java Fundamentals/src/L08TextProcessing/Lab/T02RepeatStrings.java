package L08TextProcessing.Lab;

import java.util.Scanner;

public class T02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String currWord = words[i];
            for (int j = 0; j < currWord.length(); j++) {
                stringBuilder.append(currWord);
            }
        }

        System.out.println(stringBuilder);
    }
}
