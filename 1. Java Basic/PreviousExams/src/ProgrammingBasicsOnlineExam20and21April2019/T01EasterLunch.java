package ProgrammingBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class T01EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double d = Double.parseDouble(scanner.nextLine());
        double f = Double.parseDouble(scanner.nextLine());

        double m = a * 0.75;
        double n = a * 1.1;
        double l = m * 0.2;

        double q = a * b;
        double w = m * c;
        double e = n * d;
        double r = l * f;

        System.out.printf("%.2f", q + w + e + r);
    }
}
