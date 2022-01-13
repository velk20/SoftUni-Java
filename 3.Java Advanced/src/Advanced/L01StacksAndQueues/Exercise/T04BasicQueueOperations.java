package Advanced.L01StacksAndQueues.Exercise;

import java.util.*;

public class T04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();
        while (queue.size()<n) {
            queue.offer(scanner.nextInt());
        }

        while (s-- > 0) {
            queue.poll();
        }

        if (queue.contains(x)) {
            System.out.println("true");
        } else if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(queue));
        }
    }
}
