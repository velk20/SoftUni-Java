package L11FINAL_EXAMS.T00Preparion2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(?<fullEmpji>([:][:]|[*][*])(?<emoji>[A-Z][a-z][a-z]+)\\2)";
        String regexDigit = "[0-9]";
        int coolThreshold = 1;
        int counterEmojis = 0;
        String input = scanner.nextLine();
        List<String> coolEmojis = new ArrayList<>();
        Pattern pattern = Pattern.compile(regexDigit);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            int digit = Integer.parseInt(matcher.group());
            coolThreshold *= digit;
        }

        Pattern patternEmoji = Pattern.compile(regex);
        Matcher matcherEmoji = patternEmoji.matcher(input);

        while (matcherEmoji.find()) {
            counterEmojis++;
            String emoji = matcherEmoji.group("emoji");
            int sumDigits = 0;
            for (int i = 0; i < emoji.length(); i++) {
                char ch = emoji.charAt(i);
                sumDigits += ch;
            }

            if (sumDigits >= coolThreshold) {
                coolEmojis.add(matcherEmoji.group("fullEmpji"));
            }
        }

        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(counterEmojis+" emojis found in the text. The cool ones are:");
        coolEmojis.forEach(System.out::println);

    }
}
