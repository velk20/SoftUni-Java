package Advanced.L01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();
        for (int i = 0, charArrayLength = charArray.length; i < charArrayLength; i++) {
            char c = charArray[i];
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                int startIndex = stack.pop();
                String content = input.substring(startIndex, i + 1);
                System.out.println(content);

            }
        }

    }
}
