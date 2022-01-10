package L11FINAL_EXAMS.T01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "([#|])(?<itemName>[A-Za-z ]+)\\1(?<expiration>\\d{2}\\/\\d{2}\\/\\d{2})\\1" +
                "(?<Calories>[1-9][0-9]+)\\1";

        List<String> itemNames = new ArrayList<>();
        List<String> expirationDate = new ArrayList<>();
        List<Integer> calories = new ArrayList<>();

        int totalCalories = 0;

        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String name = matcher.group("itemName");
            String date = matcher.group("expiration");
            int calorie = Integer.parseInt(matcher.group("Calories"));

            totalCalories += calorie;
            itemNames.add(name);
            expirationDate.add(date);
            calories.add(calorie);
        }

        System.out.printf("You have food to last you for: %d days!\n", totalCalories / 2000);
        if (!itemNames.isEmpty()) {
            for (int i = 0; i < itemNames.size(); i++) {
                System.out.printf("Item: %s, Best before: %s, Nutrition: %d\n", itemNames.get(i), expirationDate.get(i),
                        calories.get(i));
            }
        }
    }
}
