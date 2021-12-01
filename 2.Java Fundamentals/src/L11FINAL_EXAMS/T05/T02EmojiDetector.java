package L11FINAL_EXAMS.T05;

import java.lang.reflect.WildcardType;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coolEmojies = new ArrayList<>();
        String regex = "(?<FullEmoji>([:*]{2})(?<Emoji>[A-Z][a-z]{2,})\\2)";
        String input = scanner.nextLine();
        String regexDigit = "[0-9]";


        int coolEmojisLim = 1;

        Pattern patternnum = Pattern.compile(regexDigit);
        Matcher matcherNUm = patternnum.matcher(input);

        while (matcherNUm.find()) {
            int digit = Integer.parseInt(matcherNUm.group());
            coolEmojisLim *= digit;
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int counterEmojies = 0;
        while (matcher.find()) {
            String innerEmoji = matcher.group("Emoji");
            counterEmojies++;
            int sumASCII = 0;
            for (int i = 0; i < innerEmoji.length(); i++) {
                char ch = innerEmoji.charAt(i);
                sumASCII += ch;
            }

            if (sumASCII >= coolEmojisLim) {
                coolEmojies.add(matcher.group("FullEmoji"));
            }
        }

        System.out.println("Cool threshold: " + coolEmojisLim);
        System.out.println(counterEmojies+" emojis found in the text. The cool ones are:");
        coolEmojies.forEach(System.out::println);


    }
}
