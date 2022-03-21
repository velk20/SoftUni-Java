package Advanced.L10EXAMS.JavaAdvancedRetakeExam18August2021;

import java.util.*;
import java.util.stream.Collectors;

public class T01PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> ingredients =
                Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int biscuitCount = 0;
        int cakeCount = 0;
        int pastryCount = 0;
        int pieCount = 0;

        ArrayDeque<Integer> liquidsQueue = new ArrayDeque<>();
        ArrayDeque<Integer> ingredientsStack = new ArrayDeque<>();

        for (Integer liquid : liquids) {
            liquidsQueue.offer(liquid);
        }
        for (Integer ingredient : ingredients) {
            ingredientsStack.push(ingredient);
        }

        while (liquidsQueue.size() > 0 && ingredientsStack.size() > 0) {
            int liq = liquidsQueue.peek();
            int ing = ingredientsStack.peek();
            int sum = liq + ing;

            if (sum == 25) {
                biscuitCount++;
                liquidsQueue.poll();
                ingredientsStack.pop();
            } else if (sum == 50) {
                cakeCount++;
                liquidsQueue.poll();
                ingredientsStack.pop();
            } else if (sum == 75) {
                pastryCount++;
                liquidsQueue.poll();
                ingredientsStack.pop();
            } else if (sum == 100) {
                pieCount++;
                liquidsQueue.poll();
                ingredientsStack.pop();
            } else {
                liquidsQueue.poll();
                ingredientsStack.push(ingredientsStack.pop() + 3);
            }

        }

        if (biscuitCount > 0 && cakeCount > 0 && pastryCount > 0 && pieCount > 0) {
            System.out.println("Great! You succeeded in cooking all the food!" );
        }else System.out.println("What a pity! You didn't have enough materials to cook everything." );

        if (liquidsQueue.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.print("Liquids left: ");
            String collect = liquidsQueue.stream().map(Object::toString).collect(Collectors.joining(", "));
            System.out.println(collect);
        }

        if (ingredientsStack.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            System.out.print("Ingredients left: ");
            String collect = ingredientsStack.stream().map(Object::toString).collect(Collectors.joining(", "));
            System.out.println(collect);
        }

        System.out.printf("Biscuit: %d\n",biscuitCount);
        System.out.printf("Cake: %d\n",cakeCount);
        System.out.printf("Pie: %d\n",pieCount);
        System.out.printf("Pastry: %d\n", pastryCount);
    }
}
