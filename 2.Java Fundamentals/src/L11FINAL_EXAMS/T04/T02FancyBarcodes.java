package L11FINAL_EXAMS.T04;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<product>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                input = matcher.group("product");
                StringBuilder group = new StringBuilder();
                for (int j = 0; j < input.length(); j++) {
                    if (Character.isDigit(input.charAt(j))) {
                        group.append(input.charAt(j));
                    }
                }

                if (group.length() == 0) {

                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s\n", group.toString());

                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
