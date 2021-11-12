package L11FINAL_EXAMS.T02;

import java.util.*;

public class T01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destinations = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] tokens = input.split(":");
            String command = tokens[0];


            switch (command) {
                case "Add Stop":
                    StringBuilder stringBuilder = new StringBuilder();
                    int index = Integer.parseInt(tokens[1]);
                    String newString = tokens[2];

                    if (index >= 0 && index < destinations.length()) {
                        for (int i = 0; i < destinations.length(); i++) {
                            char ch = destinations.charAt(i);
                            if (index != i) {
                                stringBuilder.append(ch);
                            } else {

                                stringBuilder.append(newString);
                                stringBuilder.append(ch);
                            }

                        }

                        destinations = stringBuilder.toString();
                    }
                    System.out.println(destinations);
                    break;
                case "Remove Stop":
                     stringBuilder = new StringBuilder();

                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (startIndex >= 0 && endIndex < destinations.length() && startIndex<=endIndex) {
                        for (int i = 0; i < destinations.length(); i++) {
                            char ch = destinations.charAt(i);
                            if (i != startIndex) {
                                stringBuilder.append(ch);

                            } else {
                                i = endIndex;
                            }
                        }

                        destinations = stringBuilder.toString();

                    }
                    System.out.println(destinations);

                    break;
                case "Switch":
                    String oldString = tokens[1];
                    String newwerString = tokens[2];

                    if (destinations.contains(oldString)) {
                        destinations = destinations.replace(oldString, newwerString);
                    }
                    System.out.println(destinations);

                    break;
            }


            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",destinations);

    }
}
