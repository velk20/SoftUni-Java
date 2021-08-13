package Lab;

import java.util.Scanner;

public class T11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washer = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toys = 0;
        int money = 0;
        int ten = 0;
        int brother = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                ten+=10;
                money += ten;
                brother++;

            } else toys++;
        }

        double all = (toyPrice * toys) + money - (brother);
        if (washer <= all) {
            System.out.printf("Yes! %.2f",all-washer);
        }else System.out.printf("No! %.2f",Math.abs(all-washer));

    }
}
