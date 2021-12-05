package L11FINAL_EXAMS.MyFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[#@]+(?<eggColor>[a-z]{3,})[#@]+[^A-Za-z0-9]*[/]+(?<eggAmount>\\d+)[/]+";
        Pattern pattern = Pattern.compile(regex);
        String string = scanner.nextLine();
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            String eggColor = matcher.group("eggColor");
            String eggAmount = matcher.group("eggAmount");

            System.out.printf("You found %s %s eggs!\n", eggAmount, eggColor);
        }
    }
}
