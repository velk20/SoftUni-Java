package Advanced.L01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T03DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) {
            System.out.println(0);
            return;
        }

        while (number > 0) {
            int reminder = number % 2;
            stack.push(reminder);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
