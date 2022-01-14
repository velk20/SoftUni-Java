package Advanced.L01StacksAndQueues.Exercise;

import java.util.*;

public class T01RevereNumberswithaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Object::toString).map(Integer::valueOf
        ).toArray(Integer[]::new);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);

        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }
}
