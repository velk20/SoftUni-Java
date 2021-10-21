package L10MID_EXAMS.T02;

import java.util.Scanner;

public class T01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = a + b + c;

        int hour = 0;

        while (students > 0) {
            students -= studentsPerHour;
            hour++;
            if (hour % 4 == 0) {
                hour++;
            }
        }

        System.out.printf("Time needed: %dh.",hour);
    }
}
