package L06ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class T02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a1 = new BigInteger(scanner.nextLine());
        BigInteger b1 = new BigInteger(scanner.nextLine());

        System.out.println(a1.add(b1));
    }
}
