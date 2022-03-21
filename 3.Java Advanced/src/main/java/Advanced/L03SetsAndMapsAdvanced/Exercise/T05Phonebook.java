package Advanced.L03SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class T05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];


                map.put(name, number);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("stop")) {
            String name = input;
            if (map.containsKey(name)) {
                System.out.printf("%s -> %s\n", name, map.get(name));
            } else {
                System.out.printf("Contact %s does not exist.\n", name);
            }

            input = scanner.nextLine();
        }
    }
}
