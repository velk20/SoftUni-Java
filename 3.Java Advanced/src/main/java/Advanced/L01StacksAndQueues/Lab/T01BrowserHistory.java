package Advanced.L01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T01BrowserHistory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (stack.isEmpty() || stack.size() == 1) {
                    System.out.println("no previous URLs");
                } else {
                    stack.pop();
                    System.out.println(stack.peek());
                }
            } else {
                stack.push(input);
                System.out.println(input);
            }


            input = scanner.nextLine();
        }
    }
}
