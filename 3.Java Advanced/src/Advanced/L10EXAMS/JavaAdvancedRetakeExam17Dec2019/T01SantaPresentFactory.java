package Advanced.L10EXAMS.JavaAdvancedRetakeExam17Dec2019;

import java.util.*;
import java.util.stream.Collectors;

public class T01SantaPresentFactory {








    public static void main(String[] args) {
        int dollCount = 0;
        int woodenTrainCount = 0;
        int teddyBear = 0;
        int bicycle = 0;

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list1 =
                Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        ArrayDeque<Integer> materialsStack = new ArrayDeque<>();
        ArrayDeque<Integer> magicValuesQueue = new ArrayDeque<>();

        for (Integer integer : list) {
            materialsStack.push(integer);
        }

        for (Integer integer : list1) {
            magicValuesQueue.offer(integer);
        }

        while (magicValuesQueue.size() > 0 && materialsStack.size() > 0) {
            int material = materialsStack.peek();
            int magic = magicValuesQueue.peek();
            int product = material * magic;
            if (product == 0) {
                if (material==0) materialsStack.pop();
                if (magic==0) magicValuesQueue.poll();
                continue;
            }
            if (product < 0) {
                int sum = material + magic;
                materialsStack.pop();
                magicValuesQueue.poll();
                materialsStack.push(sum);
                continue;
            }

            if (product == 150) {
                materialsStack.pop();
                magicValuesQueue.poll();
                dollCount++;
            } else if (product == 250) {
                materialsStack.pop();
                magicValuesQueue.poll();
                woodenTrainCount++;
            }else if (product == 300) {
                materialsStack.pop();
                magicValuesQueue.poll();
                teddyBear++;
            } else if (product == 400) {
                materialsStack.pop();
                magicValuesQueue.poll();
                bicycle++;
            } else {
                magicValuesQueue.poll();
                materialsStack.push(materialsStack.pop() + 15);
            }

        }

        if ((dollCount > 0 && woodenTrainCount > 0) || (teddyBear > 0 && bicycle > 0)) {
            System.out.println("The presents are crafted! Merry Christmas!");
        } else {
            System.out.println("No presents this Christmas!");
        }

        if (!materialsStack.isEmpty()) {
            System.out.print("Materials left: ");
            String collect = materialsStack.stream().map(Object::toString).collect(Collectors.joining(", "));
            System.out.println(collect);

        }
        if (!magicValuesQueue.isEmpty()) {
            System.out.print("Magic left: ");
            String collect = magicValuesQueue.stream().map(Object::toString).collect(Collectors.joining(", "));
            System.out.println(collect);
        }

        Map<String, Integer> toys = new TreeMap<>();
        toys.put("Doll", dollCount);
        toys.put("Wooden train", woodenTrainCount);
        toys.put("Teddy bear", teddyBear);
        toys.put("Bicycle", bicycle);

        toys.entrySet().stream().filter(e -> e.getValue() > 0).forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));

    }
}
