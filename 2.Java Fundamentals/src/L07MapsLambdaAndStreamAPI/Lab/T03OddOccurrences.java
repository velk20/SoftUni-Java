package L07MapsLambdaAndStreamAPI.Lab;

import java.util.*;

public class T03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split(" ")).map(String::toLowerCase).toArray(String[]::new);
        Map<String, Integer> countWords = new LinkedHashMap<>();

        for (String s : words) {
            if (!countWords.containsKey(s)) {
                countWords.put(s, 1);
            } else {
                countWords.put(s, countWords.get(s) + 1);
            }
        }

        List<String> output = new ArrayList<>();
        for (Map.Entry<String, Integer> sa : countWords.entrySet()) {
            if (sa.getValue() % 2 == 1) {
                output.add(sa.getKey());

            }
        }
        System.out.println(String.join(", ",output));

    }
}
