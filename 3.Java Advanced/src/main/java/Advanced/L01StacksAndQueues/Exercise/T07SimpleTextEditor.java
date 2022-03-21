package Advanced.L01StacksAndQueues.Exercise;

import java.util.*;

public class T07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] token = scanner.nextLine().split(" ");

            switch (token[0]) {
                case "1":
                    stack.push(text.toString());
                    text.append(token[1]);
                    break;
                case "2":
                    stack.push(text.toString());
                    int count = Integer.parseInt(token[1]);
                    int startIndexForDelete = text.length() - count;
                    text.delete(startIndexForDelete, text.length());
                    break;
                case "3":
                    int index = Integer.parseInt(token[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                    text = new StringBuilder(stack.pop());
                    break;
            }
        }
    }
}
