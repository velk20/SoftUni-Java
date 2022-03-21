package OOP.L08ExceptionsAndErrorHandling.Lab;

import java.util.Scanner;

public class T02SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        try {
            double number = Math.sqrt(Double.parseDouble(string));
            if (Double.isFinite(number)) {
                System.out.printf("%.2f\n", number);
            }else System.out.println("Invalid");
        } catch (Exception e) {
            System.out.println("Invalid");
        }finally {
            System.out.println("Goodbye");

        }
    }
}
