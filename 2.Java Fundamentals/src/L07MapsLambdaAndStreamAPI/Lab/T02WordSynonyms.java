package L07MapsLambdaAndStreamAPI.Lab;

import java.util.*;

public class T02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String syn = scanner.nextLine();

            if (!synonyms.containsKey(word)) {
                List<String> list = new ArrayList<>();
                list.add(syn);
                synonyms.put(word, list);
            } else {
                List<String> naList = synonyms.get(word);
                naList.add(syn);
                synonyms.put(word, naList);
            }
        }

        for (Map.Entry<String, List<String>> s : synonyms.entrySet()) {
            System.out.println(s.getKey() + " - " + String.join(", ", s.getValue()));
        }
    }
}
