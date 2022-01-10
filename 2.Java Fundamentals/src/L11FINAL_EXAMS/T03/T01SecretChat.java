package L11FINAL_EXAMS.T03;

import java.util.*;

public class T01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] tokens = input.split(":[|]:");
            StringBuilder stringBuilder = new StringBuilder();
            switch (tokens[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);

                        for (int i = 0; i < message.length(); i++) {
                            if (index == i) {
                                stringBuilder.append(" ");
                                stringBuilder.append(message.charAt(i));
                            } else {
                                stringBuilder.append(message.charAt(i));
                            }
                        }
                    message = stringBuilder.toString();
                    System.out.println(message);
                    break;

                case "Reverse":
                    String sub = tokens[1];
                    if (message.contains(sub)) {
                        int indexOfExisting = message.indexOf(sub);
                        int endIndexOfExisting = indexOfExisting + sub.length() - 1;
                        String reversed = message.substring(indexOfExisting, endIndexOfExisting + 1);
                        StringBuilder sb = new StringBuilder(reversed);
                        sb = sb.reverse();

                        for (int i = 0; i < message.length(); i++) {
                            if (indexOfExisting == i) {
                                i = endIndexOfExisting;
                            } else {

                                stringBuilder.append(message.charAt(i));
                            }
                        }

                        message = stringBuilder.toString() + sb;
                    } else {
                        System.out.println("error");
                        break;
                    }
                    System.out.println(message);

                    break;
                case "ChangeAll":
                    String subString = tokens[1];
                    String replace = tokens[2];

                    if (message.contains(subString)) {
                        message = message.replaceAll(subString, replace);
                    }
                    System.out.println(message);

                    break;

            }
            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: "+message);
    }
}
