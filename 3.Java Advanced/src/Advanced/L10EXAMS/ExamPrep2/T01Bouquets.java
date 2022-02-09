package Advanced.L10EXAMS.ExamPrep2;

import java.util.*;
import java.util.stream.Collectors;

public class T01Bouquets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> d =
                Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> t =
                Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        ArrayDeque<Integer> daffodilsQueue = new ArrayDeque<>();
        ArrayDeque<Integer> tulipsStack = new ArrayDeque<>();

        int bouquetsCount = 0;

        List<Integer> reserveFlowers = new ArrayList<>();
        for (Integer integer : d) {
            daffodilsQueue.offer(integer);
        }
        for (Integer tulip : t) {
            tulipsStack.push(tulip);
        }

        while (!daffodilsQueue.isEmpty() && !tulipsStack.isEmpty()) {
            int daffod = daffodilsQueue.peek();
            int tulip = tulipsStack.peek();

            while (daffod + tulip > 15) {
                tulip -= 2;
            }

            tulipsStack.pop();
            tulipsStack.push(tulip);

            if (daffod + tulip == 15) {
                daffodilsQueue.poll();
                tulipsStack.pop();
                bouquetsCount++;
            } else if (daffod + tulip < 15) {
                reserveFlowers.add(daffodilsQueue.poll());
                reserveFlowers.add(tulipsStack.pop());
            }


        }

        int sumOfReservedFlowers = reserveFlowers.stream().mapToInt(e -> e).sum();
        while (sumOfReservedFlowers > 15) {
            bouquetsCount++;
            sumOfReservedFlowers-=15;
        }

        if (bouquetsCount >= 5) {
            System.out.printf("You made it! You go to the competition with %d bouquets!", bouquetsCount);
        } else System.out.printf("You failed... You need more %d bouquets.", 5 - bouquetsCount);

    }
}
