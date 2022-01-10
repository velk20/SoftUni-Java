package L11FINAL_EXAMS.T03;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([@#])(?<wordOne>[A-Za-z][A-Za-z][A-Za-z]+)\\1\\1(?<wordTwo>[A-Za-z][A-Za-z][A-Za-z]+)\\1";

        List<String> equalPairs = new ArrayList<>();
        int countOfWordPairs = 0;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            countOfWordPairs++;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            StringBuilder compareWords = new StringBuilder(wordTwo);

            if (wordOne.equals(compareWords.reverse().toString())) {
                equalPairs.add(wordOne);


            }
        }

        if (countOfWordPairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(countOfWordPairs+" word pairs found!");
        }

        if (equalPairs.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            for (String s : equalPairs) {
                StringBuilder sb = new StringBuilder(s);
                if (equalPairs.indexOf(s) == (equalPairs.size() - 1)) {
                    System.out.printf("%s <=> %s",s,sb.reverse());

                }else
                System.out.printf("%s <=> %s, ",s,sb.reverse());
            }
        }
    }
}
