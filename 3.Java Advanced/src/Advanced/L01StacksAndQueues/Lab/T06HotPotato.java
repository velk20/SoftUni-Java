package Advanced.L01StacksAndQueues.Lab;

import java.util.*;

public class T06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] data = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        Collections.addAll(queue, data);
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());

    }
}
