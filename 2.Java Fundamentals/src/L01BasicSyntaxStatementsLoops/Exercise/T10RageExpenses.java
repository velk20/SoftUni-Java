package L01BasicSyntaxStatementsLoops.Exercise;

import java.util.Scanner;

public class T10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostCount = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboradPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        int counterKey = 0;
        for (int i = 1; i <= lostCount; i++) {
            if (i % 2 == 0) {
                sum += headSetPrice;
            }
            if (i % 3 == 0) {
                sum += mousePrice;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                sum += keyboradPrice;
                counterKey++;
                if (counterKey % 2 == 0) {
                    sum += displayPrice;
                }
            }
        }

        System.out.printf("Rage expenses: %.2f lv.",sum);
    }
}
