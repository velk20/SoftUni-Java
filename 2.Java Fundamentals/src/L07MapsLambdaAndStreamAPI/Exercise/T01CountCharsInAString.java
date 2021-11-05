package L07MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class T01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            for (int j = 0; j < currentWord.length(); j++) {
                char c = currentWord.charAt(j);
                if (!characterIntegerMap.containsKey(c)) {
                    characterIntegerMap.put(c, 1);
                } else {
                    characterIntegerMap.put(c, characterIntegerMap.get(c) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> w : characterIntegerMap.entrySet()) {
            System.out.printf("%c -> %d%n", w.getKey(), w.getValue());
        }

        //characterIntegerMap.entrySet().forEach(e-> System.out.println(e.getKey()+" -> "+e.getValue()));
    }
}
