package Advanced.L03SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class T04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> map = new TreeMap<>();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];

            if (!map.containsKey(current)) {
                map.put(current, 1);
            } else {
                map.put(current, map.get(current) + 1);
            }
        }

map.entrySet().forEach(
        e->{
            System.out.printf("%c: %d time/s\n", e.getKey(), e.getValue());
        }
);
    }
}
