package Lab;

import java.util.Scanner;

public class T08Graduationpt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n = 0;
        int countOfFails = 0;
        double sum = 0;
        while (n < 12) {
            double num = Double.parseDouble(scanner.nextLine());
            if (num < 4.00) {
                countOfFails++;

            }
            if (countOfFails == 2) {
                System.out.printf("%s has been excluded at %d grade",name,n);
                break;
            }
            sum += num;
            n++;
        }
        if (n==12)
        System.out.printf("%s graduated. Average grade: %.2f",name,sum/12.0);
    }
}
