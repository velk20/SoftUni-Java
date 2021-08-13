package ProgrammingBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class T01EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countJozunak = Integer.parseInt(scanner.nextLine());
        int coriEggs = Integer.parseInt(scanner.nextLine());
        int kilos = Integer.parseInt(scanner.nextLine());

        double a = countJozunak * 3.20;
        double b = coriEggs * 4.35;
        double c = kilos * 5.40;
        double color = coriEggs * 12 * 0.15;

        System.out.printf("%.2f", a + b + c + color);
    }
}
