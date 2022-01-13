package Advanced.L01StacksAndQueues.Exercise;

import java.util.*;

public class T05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (isBracketsBalanced(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isBracketsBalanced(String string) {
        ArrayDeque<Character> bracketsStack = new ArrayDeque<>();

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                bracketsStack.push(currentChar);
                continue;
            }

            if (bracketsStack.isEmpty()) {
                return false;
            }

            switch (currentChar) {
                case ')':
                    char popCharacter = bracketsStack.pop();
                    if (popCharacter == '{' || popCharacter == '[') {
                        return false;
                    }
                    break;

                    case '}':
                    char popCharacter1 = bracketsStack.pop();
                    if (popCharacter1 == '(' || popCharacter1 == '[') {
                        return false;
                    }
                    break;

                    case ']':
                    char popCharacter2 = bracketsStack.pop();
                    if (popCharacter2 == '{' || popCharacter2 == '(') {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
}
