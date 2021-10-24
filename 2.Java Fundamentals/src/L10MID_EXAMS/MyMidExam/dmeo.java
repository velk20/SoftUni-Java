package L10MID_EXAMS.MyMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class dmeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            switch (tokens[0]) {
                case "Add":
                    String cardNameAdd = tokens[1];
                    if (cards.contains(cardNameAdd)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        cards.add(cardNameAdd);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    String cardNameRemove = tokens[1];
                    if (cards.contains(cardNameRemove)) {
                        cards.remove(cardNameRemove);
                        System.out.println("Card successfully removed");

                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int indexRemoveAt = Integer.parseInt(tokens[1]);
                    if (indexRemoveAt >= 0 && indexRemoveAt < cards.size()) {
                        cards.remove(indexRemoveAt);
                        System.out.println("Card successfully removed");
                    }else System.out.println("Index out of range");
                    break;
                case "Insert":
                    int indexInsert = Integer.parseInt(tokens[1]);
                    String cardNameInsert = tokens[2];

                    if (indexInsert < 0 || indexInsert >= cards.size()) {
                        System.out.println("Index out of range");
                    } else if (cards.contains(cardNameInsert)) {
                        System.out.println("Card is already added");
                    } else {
                        cards.add(indexInsert, cardNameInsert);
                        System.out.println("Card successfully added");
                    }
                    break;
            }
        }

        System.out.println(String.join(", ", cards));
    }
}
