package Advanced.L01StacksAndQueues.Lab;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class T02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] numbersAndOperations = scanner.nextLine().split("\\s+");
        stack.addAll(Arrays.asList(numbersAndOperations));


        while (stack.size()!= 1) {
            int r = 0;
            int num1 = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int num2 = Integer.parseInt(stack.pop());


            if (operation.equals("+")) {
                r = num1 + num2;
                stack.addFirst(r+"");
            } else {
                r = num1 - num2;
                stack.addFirst(r + "");
            }


        }

        System.out.println(stack.peek());
    }
}
