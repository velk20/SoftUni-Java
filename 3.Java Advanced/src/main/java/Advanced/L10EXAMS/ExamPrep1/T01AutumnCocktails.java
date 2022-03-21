package Advanced.L10EXAMS.ExamPrep1;

import java.util.*;
import java.util.stream.Collectors;

public class T01AutumnCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integredients = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> freshness =
                Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int pearSourCount = 0;
        int theHarvestCount = 0;
        int appleHinnyCount = 0;
        int highFashionCount = 0;

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> freshStack = new ArrayDeque<>();

        for (Integer integer : integredients) {
            queue.offer(integer);
        }
        for (Integer integer : freshness) {
            freshStack.push(integer);
        }

        while (queue.size() != 0 && freshStack.size() != 0) {
            int ingredient = queue.peek();
            if (ingredient == 0) {

                queue.poll();
                continue;
            }
            int fresh = freshStack.peek();

            int mix = ingredient * fresh;
            if (mix == 150) {
                pearSourCount++;
                queue.poll();
                freshStack.pop();
            } else if (mix == 250) {
                theHarvestCount++;
                queue.poll();
                freshStack.pop();
            }else if (mix == 300) {
                appleHinnyCount++;
                queue.poll();
                freshStack.pop();
            } else if (mix == 400) {
                highFashionCount++;
                queue.poll();
                freshStack.pop();
            } else {
                freshStack.pop();
                ingredient+=5;
                queue.poll();
                queue.offerLast(ingredient);
            }

        }
        Map<String, Integer> cock = new TreeMap<>();
        cock.put("Apple Hinny", appleHinnyCount);
        cock.put("High Fashion", highFashionCount);
        cock.put("Pear Sour", pearSourCount);
        cock.put("The Harvest", theHarvestCount);
        if (pearSourCount >= 1 && theHarvestCount >= 1 && appleHinnyCount >= 1 && highFashionCount >= 1) {
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }

        if (queue.size() != 0) {
            System.out.printf("Ingredients left: %d\n",queue.stream().mapToInt((e -> e)).sum());
        }

        cock.entrySet().stream().filter(e->e.getValue()>=1).forEach(e->
        {
            System.out.printf(" # %s --> %d\n", e.getKey(), e.getValue());
        });
    }
}
