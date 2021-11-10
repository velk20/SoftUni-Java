package L08TextProcessing.Lab;

import java.util.Scanner;

public class T04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {
            String word = bannedWords[i];
            while (text.contains(word)) {
                int startI = text.indexOf(word);
                int endI = startI + word.length();
                String remove = text.substring(startI,endI);
                String stars = "";
                for (int j = 0; j < word.length(); j++) {
                    stars+="*";
                }
                text = text.replace(remove,stars);
            }
        }

        System.out.println(text);
    }
}
