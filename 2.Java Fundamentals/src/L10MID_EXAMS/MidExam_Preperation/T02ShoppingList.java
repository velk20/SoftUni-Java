package L10MID_EXAMS.MidExam_Preperation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class T02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String [] tokens = input.split(" ");
            String item;
            switch (tokens[0]) {
                case "Urgent":
                     item = tokens[1];
                    urgent(products, item);
                    break;
                case "Unnecessary":
                     item = tokens[1];
                    unnecessary(products, item);
                    break;
                case "Correct":
                    String oldItem = tokens[1];
                    String newItem = tokens[2];
                    correct(products, oldItem, newItem);
                    break;
                case "Rearrange":
                    item = tokens[1];
                    rearrange(products, item);
                    break;

            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ",products));
    }

    private static void rearrange(List<String> products, String item) {
        if (products.contains(item)) {
            products.remove(item);
            products.add(item);
        }
    }

    private static void correct(List<String> products, String oldItem, String newItem) {
        if (products.contains(oldItem)) {
            int index = products.indexOf(oldItem);
            products.set(index, newItem);
        }
    }

    private static void unnecessary(List<String> products, String item) {
        if (products.contains(item)) {
            products.remove(item);
        }
    }

    private static void urgent(List<String> products, String item) {
        if (!products.contains(item)) {
            products.add(0, item);
        }
    }
}
