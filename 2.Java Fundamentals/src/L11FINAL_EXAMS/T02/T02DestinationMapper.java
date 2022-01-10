package L11FINAL_EXAMS.T02;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> destinations = new ArrayList<>();
        String regex = "([=/])(?<destination>[A-Z][A-Za-z][A-Za-z]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(scanner.nextLine());

        while (matcher.find()) {
            destinations.add(matcher.group("destination"));

        }

        int points = 0;
        for (String s : destinations) {
            char[] arr = s.toCharArray();
            points += arr.length;
        }

        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinations));
        System.out.println("Travel Points: "+points);
    }
}
