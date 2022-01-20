package Advanced.L03SetsAndMapsAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class T03VoinaNumbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondDeck =
                Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        for (int i = 0; i < 50; i++) {
            if (firstDeck.isEmpty()) {
                System.out.println("Second player win!");
                return;
            }  if (secondDeck.isEmpty()) {
                System.out.println("First player win!");
                return;
            }
            int firstCard = firstDeck.iterator().next();
            int secondCard = secondDeck.iterator().next();
            firstDeck.remove(firstCard);
            secondDeck.remove(secondCard);

            if (firstCard > secondCard) {
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else if (secondCard > firstCard) {
                secondDeck.add(firstCard);
                secondDeck.add(secondCard);
            } else {
                firstDeck.add(firstCard);
                secondDeck.add(secondCard);
            }
        }

        if (secondDeck.size() > firstDeck.size()) {

            System.out.println("Second player win!");

        } else if (firstDeck.size() > secondDeck.size()) {
            System.out.println("First player win!");

        } else {
            System.out.println("Draw!");
        }

    }
}
