package Advanced.L01StacksAndQueues.Exercise;

import java.util.*;

public class T02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        while (stack.size() < n) {
            stack.push(scanner.nextInt());
        }

        while (s-- > 0) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        }
        else if (stack.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stack));
        }

    }
}
