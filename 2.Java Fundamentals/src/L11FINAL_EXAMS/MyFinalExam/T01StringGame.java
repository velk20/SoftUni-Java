package L11FINAL_EXAMS.MyFinalExam;

import java.util.Scanner;

public class T01StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if (command.equals("Change")) {
                String oldChar = tokens[1];
                String replacement = tokens[2];
                myString = myString.replaceAll(oldChar, replacement);
                System.out.println(myString);
            } else if (command.equals("Includes")) {
                String subString = tokens[1];
                if (myString.contains(subString)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (command.equals("End")) {
                String subString = tokens[1];

                if (myString.endsWith(subString)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (command.equals("Uppercase")) {
                myString = myString.toUpperCase();
                System.out.println(myString);
            } else if (command.equals("FindIndex")) {
                String myChar = tokens[1];
                System.out.println(myString.indexOf(myChar));

            } else if (command.equals("Cut")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int count = Integer.parseInt(tokens[2]);

                myString = myString.substring(startIndex, startIndex + count);
                System.out.println(myString);
            }

            input = scanner.nextLine();
        }

    }
}
