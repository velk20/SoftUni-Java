package L10MID_EXAMS.T06;

import java.util.Scanner;

public class T01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double output = 0;

        for (int i = 1; i <= days; i++) {
            output += dailyPlunder;
            if (i % 3 == 0) {
                output += dailyPlunder*1.0 / 2;
            }
            if (i % 5 == 0) {
                output *= 0.7;
            }
        }

        if (output >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", output);
        } else System.out.printf("Collected only %.2f%% of the plunder.", output / expectedPlunder * 100);
    }
}
