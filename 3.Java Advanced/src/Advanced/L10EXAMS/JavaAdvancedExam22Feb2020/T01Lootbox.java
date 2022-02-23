package Advanced.L10EXAMS.JavaAdvancedExam22Feb2020;

import java.util.*;

public class T01Lootbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> firstBox = new ArrayDeque<>();

        ArrayDeque<Integer> secondBox = new ArrayDeque<>();
        List<Integer> claimItems = new ArrayList<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(firstBox::offer);
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(secondBox::push);

        while (!firstBox.isEmpty() && !secondBox.isEmpty()) {
            int f = firstBox.peek();
            int s = secondBox.peek();

            if ((f + s) % 2 == 0) {
                firstBox.poll();
                secondBox.pop();
                claimItems.add(f + s);
            } else {
                firstBox.offer(secondBox.pop());
            }
        }

        if (firstBox.isEmpty()) {
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }

        int sum = claimItems.stream().mapToInt(e -> e).sum();
        if (sum >= 100) {
            System.out.printf("Your loot was epic! Value: %d",sum);
        } else System.out.printf("Your loot was poor... Value: %d", sum);
    }
}
