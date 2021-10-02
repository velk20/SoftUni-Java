package L04Methods.Lab;

import java.util.Scanner;

public class T01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        SignOfIntegers(n);
    }

    public static void SignOfIntegers(int n) {
        if (n < 0) {
            System.out.printf("The number %d is negative.",n);
        } else if (n == 0) {
            System.out.printf("The number 0 is zero.");
        }else if (n > 0) {
            System.out.printf("The number %d is positive.", n);
        }
    }
}
