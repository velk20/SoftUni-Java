package Advanced.L03SetsAndMapsAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class T04CoutRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());
        Map<Double, Integer> map = new LinkedHashMap<>();

        for (Double num : numbers) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        map.entrySet().stream().forEach(e ->
                System.out.printf("%.1f -> %d\n", e.getKey(), e.getValue())
        );

    }
}
