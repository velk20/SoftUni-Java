package L05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> deckOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> deckTwo =
                Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (deckOne.size() > 0 && deckTwo.size() > 0) {
            int one = deckOne.get(0);
            int two = deckTwo.get(0);
            if (one > two) {
                deckOne.add(one);
                deckOne.add(two);
                deckOne.remove(0);
                deckTwo.remove(0);

            } else if (two > one) {
                deckTwo.add(two);
                deckTwo.add(one);
                deckOne.remove(0);
                deckTwo.remove(0);
            } else if (two == one) {
                deckOne.remove(0);
                deckTwo.remove(0);
            }
        }

        if (deckOne.size() == 0) {
            for (int n :
                    deckTwo) {
                sum += n;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else if (deckTwo.size() == 0) {
            for (int n :
                    deckOne) {
                sum += n;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
