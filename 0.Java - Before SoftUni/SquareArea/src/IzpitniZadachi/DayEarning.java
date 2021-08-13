package IzpitniZadachi;

import java.util.Scanner;

public class DayEarning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double D = Double.parseDouble(scanner.nextLine());
        double M = Double.parseDouble(scanner.nextLine());
        double K =Double.parseDouble(scanner.nextLine());

        double monthEarning = D*M;
        double yearEarning = (monthEarning*12)+(monthEarning*2.5);
        double taxes = yearEarning*25/100;
        double salary = (yearEarning - taxes)*K;
        double average = salary/365;

        System.out.printf("%.2f",average);
    }
}
