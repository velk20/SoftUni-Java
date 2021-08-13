package MoreExercise;

import java.util.Scanner;

public class T04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int top = 0;
        int second = 0;
        int third = 0;
        int fail = 0;
        int average = 0;
        for (int i = 1; i <= students; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            sum += num;
            if (num >= 5.00) {
                top++;
            } else if (num >= 4.00 && num <= 4.99) {
                second++;
            } else if (num >= 3.00 && num <= 3.99) {
                third++;
            } else if (num < 3.00) {
                fail++;
            }

        }

        System.out.printf("Top students: %.2f%%\n",(double)top/students*100.0);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n",(double)second/students*100.0);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",(double)third/students*100.0);
        System.out.printf("Fail: %.2f%%\n",(double)fail/students*100.0);
        System.out.printf("Average: %.2f",sum/students);
    }
}
