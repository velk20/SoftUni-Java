package L09RegularExpressions.Exercise;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?" +
        "(?<price>[\\d]+.?[\\d]*)\\$";

        List<String> output = new LinkedList<>();
        double totalIncome = 0;
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                String total = String.format("%.2f", quantity * price);
                output.add(name + ": " + product + " - " + total);
                totalIncome += quantity * price;

            }

            input = scanner.nextLine();
        }

        output.forEach(System.out::println);
        System.out.printf("Total income: %.2f", totalIncome);

    }
}
