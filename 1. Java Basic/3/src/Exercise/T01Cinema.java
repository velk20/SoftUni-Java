package Exercise;

import java.util.Scanner;

public class T01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        int hall = rows * cols;
        double income = 0.0;

        switch (projection) {
            case "Premiere":
                income = hall * 12.00;
                System.out.printf("%.2f leva",income);
                break;

            case "Normal":
                income = hall * 7.50;
                System.out.printf("%.2f leva",income);
                break;
            case "Discount":
                income = hall * 5.00;
                System.out.printf("%.2f leva",income);
                break;

        }
    }
}
