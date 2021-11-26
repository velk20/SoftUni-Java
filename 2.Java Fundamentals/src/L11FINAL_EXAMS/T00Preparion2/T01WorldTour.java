package L11FINAL_EXAMS.T00Preparion2;

import java.util.Scanner;

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
                        String firstHalf = destinations.substring(0, index);
                        String secondHalf = destinations.substring(index);

                        stringBuilder.append(firstHalf);
                        stringBuilder.append(newString);
                        stringBuilder.append(secondHalf);
                        }
                        destinations = stringBuilder.toString();
                    System.out.println(destinations);
                    break;

                case "Remove Stop":
                      stringBuilder = new StringBuilder();
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (startIndex >= 0 && endIndex < destinations.length() && startIndex<=endIndex) {

                        String firstPart = destinations.substring(0, startIndex);
                        String secondPart = destinations.substring(endIndex + 1);

                        stringBuilder.append(firstPart);
                        stringBuilder.append(secondPart);

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
