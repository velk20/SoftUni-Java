package L11FINAL_EXAMS.T00Preparion1;

import java.util.*;

public class T01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawActivationKey = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] tokens = input.split(">>>");
            String command = tokens[0];

            switch (command) {
                case "Contains":
                    String checkSubstringContains = tokens[1];
                    if (rawActivationKey.contains(checkSubstringContains)) {
                        System.out.printf("%s contains %s\n", rawActivationKey, checkSubstringContains);
                    }else System.out.println("Substring not found!");
                    break;

                case "Flip":
                    String upperOrLowerCase = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);

                    String substringToFLip = rawActivationKey.substring(startIndex, endIndex);
                    if (upperOrLowerCase.equals("Upper")) {
                        substringToFLip = substringToFLip.toUpperCase();
                    } else substringToFLip = substringToFLip.toLowerCase();

                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 0; i < rawActivationKey.length(); i++) {
                        if (i != startIndex) {
                            stringBuilder.append(rawActivationKey.charAt(i));
                        } else {
                            stringBuilder.append(substringToFLip);
                            i = endIndex-1;
                        }
                    }
                    rawActivationKey = stringBuilder.toString();
                    System.out.println(rawActivationKey);

                    break;

                case "Slice":
                    int startIndexDelete = Integer.parseInt(tokens[1]);
                    int endIndexDelete = Integer.parseInt(tokens[2]);

                    StringBuilder stringBuilderToDelete = new StringBuilder(rawActivationKey);
                    stringBuilderToDelete.delete(startIndexDelete, endIndexDelete);

                    rawActivationKey = stringBuilderToDelete.toString();
                    System.out.println(rawActivationKey);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",rawActivationKey);
    }
}
