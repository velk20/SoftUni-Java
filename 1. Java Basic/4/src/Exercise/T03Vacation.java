package Exercise;

import java.util.Scanner;

public class T03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationNeededMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int countDays = 0;
        int countSpend = 0;

        while (money < vacationNeededMoney && countSpend<5) {
            String input = scanner.nextLine();
            double num = Double.parseDouble(scanner.nextLine());
            countDays++;
            if (input.equals("spend")) {
                money -= num;
                countSpend++;
                if (money < 0) {
                    money = 0;
                }

            } else if (input.equals("save")) {
                money += num;
                countSpend = 0;
            }



        }

        if (countSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        }
        if (money >= vacationNeededMoney) {
            System.out.printf("You saved the money for %d days.",countDays);
        }
    }
}
