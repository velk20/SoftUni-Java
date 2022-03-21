package Advanced.MY_EXAM;

import java.util.*;

public class T01FoodFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character> vowelsQueue = new ArrayDeque<>();
        ArrayDeque<Character> consonantsStack = new ArrayDeque<>();

        int countWords = 0;

        Arrays.stream(scanner.nextLine().split("\\s+")).map(e -> e.charAt(0)).forEach(vowelsQueue::offer);
        Arrays.stream(scanner.nextLine().split("\\s+")).map(e -> e.charAt(0)).forEach(consonantsStack::push);
        List<String> words = new ArrayList<>();
        words.add("pear");
        words.add("flour");
        words.add("pork");
        words.add("olive");

        while (!consonantsStack.isEmpty()) {
            String vow = String.valueOf(vowelsQueue.peek());
            String cons = String.valueOf(consonantsStack.peek());

            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                if (word.contains(vow)) {

                    word = word.replaceAll(vow, "");
                    words.set(i, word);
                }
                if (word.contains(cons)) {

                    word = word.replaceAll(cons, "");
                    words.set(i, word);
                }


            }

            vowelsQueue.offerLast(vowelsQueue.poll());
            consonantsStack.pop();

        }

        for (String word : words) {
            if (word.equals("")) countWords++;
        }
        System.out.printf("Words found: %d\n", countWords);
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals("") && i == 0) {
                System.out.println("pear");

            } else if (words.get(i).equals("") && i == 1) {
                System.out.println("flour");
            }else if (words.get(i).equals("") && i == 2) {
                System.out.println("pork");
            }else if (words.get(i).equals("") && i == 3) {
                System.out.println("olive");
            }
        }


    }
}
