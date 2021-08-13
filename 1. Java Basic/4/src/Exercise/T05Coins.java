package Exercise;

import java.util.Scanner;

public class T05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;



        double coins = Double.parseDouble(scanner.nextLine());
        double num = coins * 100;
        while (num > 0) {
            if (num >= 200) {
                count++;
                num -= 200;
            } else if (num >= 100) {
                count++;
                num -= 100;
            } else if (num >= 50) {
                count++;
                num -= 50;
            } else if (num >= 20) {
                count++;
                num -= 20;
            } else if (num >= 10) {
                count++;
                num -= 10;
            } else if (num >= 5) {
                count++;
                num -= 5;

            } else if (num >= 2) {
                count++;
                num -= 2;
            } else if (num >= 1) {
                count++;
                num-=1;
            } else {
                break;
            }
        }

        System.out.printf("%d",count);

    }
}
