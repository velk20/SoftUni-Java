package L11FINAL_EXAMS.T01;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class T01TheImitationGame {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        String commands = scanner.nextLine();
        while (!commands.equals("Decode")) {

            String[] tokens = commands.split("\\|");

            switch (tokens[0]) {
                case "Move":
                    int countOfLetters = Integer.parseInt(tokens[1]);
                    List<Character> messageArray = message

                            // Convert to String to IntStream
                            .chars()

                            // Convert IntStream to Stream<Character>
                            .mapToObj(e -> (char)e)

                            // Collect the elements as a List Of Characters
                            .collect(Collectors.toList());


                    Collections.rotate(messageArray,-countOfLetters);
                    StringBuilder newString = new StringBuilder();
                    for (Character character : messageArray) {
                        newString.append(character);
                    }

                    message = newString.toString();

                    break;

                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];

                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < message.length(); i++) {
                        if (i == index) {
                            sb.append(value);
                        }
                        sb.append(message.charAt(i));
                    }
                    if (message.length() == index) {
                        sb.append(value);
                    }
                    message = sb.toString();

                    break;

                case "ChangeAll":
                    String substr = tokens[1];
                    String replacementString = tokens[2];
                    while (message.contains(substr)) {
                        message = message.replace(substr, replacementString);
                    }
                    break;

            }

            commands = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s",message);
    }
}
