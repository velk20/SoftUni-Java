package Advanced.L01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> deque = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (deque.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + deque.poll());
                }
            } else {
                deque.offer(input);
            }

            input = scanner.nextLine();
        }


        while (!deque.isEmpty()) {
            System.out.println(deque.poll());

        }

    }
}
