package Advanced.L01StacksAndQueues.Exercise;

import java.util.*;

public class T03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int command = tokens[0];
            if (command == 1) {
                int num = tokens[1];
                stack.push(num);

            } else if (command == 2) {
                stack.pop();
            } else if (command == 3) {
                System.out.println(Collections.max(stack));
            }
        }
    }
}
