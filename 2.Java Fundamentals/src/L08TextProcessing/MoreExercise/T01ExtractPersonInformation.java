package L08TextProcessing.MoreExercise;

import java.util.Scanner;

public class T01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            nameAndAgeFounder(input);
        }
    }

    private static void nameAndAgeFounder(String input) {
        String name = "";
        String age = "";

        int startIndexName = input.indexOf("@");
        int endIndexName = input.indexOf("|");

        int startIndexAge = input.indexOf("#");
        int endIndexAge = input.indexOf("*");

        name = input.substring(startIndexName+1,endIndexName);
        age = input.substring(startIndexAge + 1, endIndexAge);

        System.out.printf("%s is %s years old.\n",name,age  );

    }


}
