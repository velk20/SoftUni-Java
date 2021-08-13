package Exercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double points = Double.parseDouble(scanner.nextLine());
        double bonus = 0;
        if (points<=100) {
            bonus += 5;
        } else if (points>100&& points <=1000) {
            bonus += points * 0.2;
        } else if (points>1000) {
            bonus += points * 0.1;
        }

        if (points%2==0) {
            bonus += 1;
        }
        if (points % 10 == 5) {
            bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(bonus+points);
    }
}
