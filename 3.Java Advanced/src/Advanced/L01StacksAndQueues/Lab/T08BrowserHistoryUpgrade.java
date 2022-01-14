package Advanced.L01StacksAndQueues.Lab;

import java.util.*;

public class T08BrowserHistoryUpgrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();

        String input = scanner.nextLine();
        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (stack.isEmpty() || stack.size() == 1) {
                    System.out.println("no previous URLs");
                } else {
                    forwardStack.push(stack.pop());
                    System.out.println(stack.peek());
                }
            } else if (input.equals("forward")) {
                if (forwardStack.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    stack.push(forwardStack.pop());
                    System.out.println(stack.peek());
                }
            } else {
                stack.push(input);
                forwardStack.clear();
                System.out.println(input);
            }


            input = scanner.nextLine();
        }
    }
}
