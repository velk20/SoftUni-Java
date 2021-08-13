package ProgrammingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class T05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        double ala = capacity;
        int counter = 0;
        String input  = scanner.nextLine();
        while (!input.equals("End")) {
            double num = Double.parseDouble(input);
            if (counter+1 % 3 == 0) {
                double a = num * 0.1;
                ala -= a + num;

            } else {

                ala -= num;
            }
            if (ala <= 0) {
                System.out.printf("No more space!\n");
                System.out.printf("Statistic: %d suitcases loaded.", counter);
                break;

            } else {
                counter++;
                input = scanner.nextLine();

            }

        }

        if (input.equals("End")) {
            System.out.printf("Congratulations! All suitcases are loaded!\n");
            System.out.printf("Statistic: %d suitcases loaded.",counter);
        }
    }
}
