package ProgrammingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class T02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordSecond = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double timeForSec = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        double m = meters * timeForSec;
        double n = Math.floor(meters / 50);
        sum = m + (n * 30);

        if (recordSecond<=sum) {
            System.out.printf("No! He was %.2f seconds slower.", sum - recordSecond);
        }else System.out.printf(" Yes! The new record is %.2f seconds.",sum);
    }
}
