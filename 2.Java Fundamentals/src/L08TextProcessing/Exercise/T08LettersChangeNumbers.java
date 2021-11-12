package L08TextProcessing.Exercise;

import java.util.Scanner;

public class T08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] passwords = input.split("\\s+");
        double totalSum = 0;
        for (String password : passwords) {
            double currentSum =getCurrentSum(password);

                    totalSum+=currentSum;
        }
        System.out.printf("%.2f",totalSum);
    }

    private static double getCurrentSum(String password) {
        char firstLetter = password.charAt(0);

        char secondLetter = password.charAt(password.length() - 1);
        //int number = Integer.parseInt(password.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());
        //int number = Integet.parseInt(password.substring(1,password.indexOf(secondLetter));
        StringBuilder builder = new StringBuilder(password);
        double number = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length() - 1).toString());


        if (Character.isUpperCase(firstLetter)) {
            //positio in alphabet
            int positionUpperLEtter = (int) firstLetter - 64;
            number = number / positionUpperLEtter;
        } else {
            int positionLowerLetter = (int) firstLetter - 96;
            number = number * positionLowerLetter;
        }

        if (Character.isUpperCase(secondLetter)) {
            int positionUpperLEtter = (int) secondLetter - 64;

            number = number - positionUpperLEtter;
        }else {
            int positionLowerLetter = (int) secondLetter - 96;
            number = number + positionLowerLetter;

        }


        return number;

    }
}
