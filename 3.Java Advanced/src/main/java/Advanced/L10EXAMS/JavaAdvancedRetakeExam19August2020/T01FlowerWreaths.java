package Advanced.L10EXAMS.JavaAdvancedRetakeExam19August2020;

import java.util.*;
import java.util.stream.Collectors;

public class T01FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flowerWreathCount = 0;
        int storedFlowers = 0;
        List<Integer> input = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        ArrayDeque<Integer> liliesStack = new ArrayDeque<>();
        ArrayDeque<Integer> rosesQueue = new ArrayDeque<>();

        for (Integer integer : input) {
            liliesStack.push(integer);
        }
        input = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        for (Integer integer : input) {
            rosesQueue.offer(integer);
        }

        while (liliesStack.size() > 0 && rosesQueue.size() > 0) {
            int lili = liliesStack.peek();
            int rose = rosesQueue.peek();

            if (lili + rose == 15) {
                liliesStack.pop();
                rosesQueue.poll();
                flowerWreathCount++;
            } else if (lili + rose > 15) {
                liliesStack.push(liliesStack.pop() - 2);
            } else if (lili + rose < 15) {
                storedFlowers += lili + rose;
                liliesStack.pop();
                rosesQueue.poll();
            }
        }

        while (storedFlowers > 15) {
            flowerWreathCount++;
            storedFlowers -= 15;
        }

        if (flowerWreathCount >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", flowerWreathCount);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - flowerWreathCount);
        }


    }
}
