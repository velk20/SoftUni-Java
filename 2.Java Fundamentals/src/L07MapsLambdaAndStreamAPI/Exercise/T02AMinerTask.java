package L07MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class T02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resources.containsKey(input)) {
                resources.put(input, quantity);
            } else {
                resources.put(input, resources.get(input) + quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
