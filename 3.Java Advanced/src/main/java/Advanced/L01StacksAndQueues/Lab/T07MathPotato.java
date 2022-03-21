package Advanced.L01StacksAndQueues.Lab;

import java.util.*;

public class T07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] data = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        Collections.addAll(queue, data);
        int counter = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            if (!isPrime(counter)) {
                System.out.println("Removed " + queue.poll());
            } else {
                System.out.println("Prime " + queue.peek());
            }
            counter++;
        }
        System.out.println("Last is " + queue.poll());
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


