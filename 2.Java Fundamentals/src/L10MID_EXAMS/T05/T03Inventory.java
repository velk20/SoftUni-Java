package L10MID_EXAMS.T05;

import java.util.*;
import java.util.stream.Collectors;

public class T03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String [] tokens = input.split(" - ");
            String item = tokens[1];
            switch (tokens[0]) {
                case "Collect":
                    if (!items.contains(item)) {
                        items.add(item);
                    }
                    break;

                case "Drop":
                    if (items.contains(item)) {
                        items.remove(item);
                    }
                    break;

                case "Combine Items":
                    String [] oldAndNew = item.split(":");
                    String oldItem = oldAndNew[0];
                    String newItem = oldAndNew[1];
                    if (items.contains(oldItem)) {
                        int index = items.indexOf(oldItem);
                        items.add(index + 1, newItem);
                    }
                    break;

                case "Renew":
                    if (items.contains(item)) {
                        items.remove(item);
                        items.add(item);
                    }
                    break;

            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ",items));
    }
}
