package L09RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        double total = 0.0;
        String regex = "[>]{2}(?<name>[A-Za-z]+)[<]{2}(?<price>[\\d]+[.\\d]+?)[!](?<quantity>\\d+)\\b";
        String input = scanner.nextLine();
        while (!input.equals("Purchase")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String price = matcher.group("price");
                String quantity = matcher.group("quantity");

                 total += Double.parseDouble(price) * Integer.parseInt(quantity);

                list.add(name);


            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        list.forEach(System.out::println);

        System.out.printf("Total money spend: %.2f",total);
    }
}
