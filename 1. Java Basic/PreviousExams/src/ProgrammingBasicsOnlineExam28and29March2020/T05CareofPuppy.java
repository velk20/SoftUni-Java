package ProgrammingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class T05CareofPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilosFood = Integer.parseInt(scanner.nextLine());
        int gramsFood = kilosFood * 1000;
        String input = scanner.nextLine();
        int sum = 0;
        while (!input.equals("Adopted")) {
            int food = Integer.parseInt(input);
            sum += food;

            input = scanner.nextLine();
        }

        if (sum <= gramsFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", gramsFood - sum);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.",Math.abs(gramsFood-sum));
        }
    }
}
