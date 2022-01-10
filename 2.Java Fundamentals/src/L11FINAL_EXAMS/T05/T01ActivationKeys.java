package L11FINAL_EXAMS.T05;


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
                    String checkContains = tokens[1];
                    if (rawActivationKey.contains(checkContains)) {
                        System.out.printf("%s contains %s\n", rawActivationKey, checkContains);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String upperOrLower = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);

                    if (upperOrLower.equals("Upper")) {
                        String sub = rawActivationKey.substring(startIndex, endIndex);
                        String newSub = sub.toUpperCase();
                        rawActivationKey = rawActivationKey.replace(sub, newSub);
                        System.out.println(rawActivationKey);
                    } else {
                        String sub = rawActivationKey.substring(startIndex, endIndex);
                        String newSub = sub.toLowerCase();
                        rawActivationKey = rawActivationKey.replace(sub, newSub);
                        System.out.println(rawActivationKey);
                    }
                    break;

                case "Slice":
                    int startIndexSlice = Integer.parseInt(tokens[1]);
                    int endIndexSlice = Integer.parseInt(tokens[2]);
                    String subS = rawActivationKey.substring(startIndexSlice, endIndexSlice);
                    rawActivationKey = rawActivationKey.replace(subS, "");
                    System.out.println(rawActivationKey);

                    break;

            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",rawActivationKey);
    }
}
