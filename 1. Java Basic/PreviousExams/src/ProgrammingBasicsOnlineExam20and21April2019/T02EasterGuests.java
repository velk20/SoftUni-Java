package ProgrammingBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class T02EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double kuzunaci = Math.ceil(guests / 3.0);
        double qica = guests * 2;

        double price1 = kuzunaci * 4;
        double prize2 = qica * 0.45;
        double sum = price1 + prize2;

        if (sum <= budget) {
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.\n", (int) kuzunaci, (int) qica);
            System.out.printf("He has %.2f lv. left.", budget - sum);
        } else {
            System.out.printf("Lyubo doesn't have enough money.\n" +
                    "He needs %.2f lv. more.",sum-budget);
        }
    }
}
