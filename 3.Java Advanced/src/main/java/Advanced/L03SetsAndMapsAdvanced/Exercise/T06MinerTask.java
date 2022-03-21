package Advanced.L03SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class T06MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!map.containsKey(input)) {
                map.put(input, quantity);
            } else {
                map.put(input, map.get(input) + quantity);
            }


            input = scanner.nextLine();
        }

        map.entrySet().forEach(e->{
            System.out.printf("%s -> %d\n", e.getKey(), e.getValue());
        });
    }
}
