package L10MID_EXAMS.T01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> seq = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String[] input = scanner.nextLine().split(" ");
        int moves = 0;
        boolean win = false;
        while (!input[0].equals("end")) {
            int indexOne = Integer.parseInt(input[0]);
            int indexTwo = Integer.parseInt(input[1]);
            moves++;
            if (indexOne >= 0 && indexOne < seq.size() && indexOne != indexTwo && indexTwo >= 0 && indexTwo < seq.size()) {
                if (seq.get(indexOne).equals(seq.get(indexTwo))) {
                    System.out.printf("Congrats! You have found matching elements - %s!\n", seq.get(indexOne));
                    if (indexOne < indexTwo) {
                        seq.remove(indexOne);
                        seq.remove(indexTwo-1);
                    } else if (indexTwo < indexOne) {
                        seq.remove(indexTwo);
                        seq.remove(indexOne - 1);
                    }
                } else {
                    System.out.println("Try again!");

                }

                if (seq.isEmpty()) {
                    win = true;
                    System.out.printf("You have won in %d turns!\n", moves);
                    break;
                }

            } else {
                System.out.println("Invalid input! Adding additional elements to the board");
                int middle = seq.size() / 2;
                String addItem = "-"+moves+"a";
                seq.add(middle, addItem);
                seq.add(middle, addItem);
            }
            input = scanner.nextLine().split(" ");
        }

        if (!win) {
            System.out.println("Sorry you lose :(");
            for (String  n :seq) {
                System.out.printf("%s ", n);
            }

        }
    }
}
