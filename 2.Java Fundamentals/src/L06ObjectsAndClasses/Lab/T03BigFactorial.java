package L06ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class T03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = Integer.parseInt(scanner.nextLine());
        BigInteger bigInt = new BigInteger("1");//String.valueOf(1);
        for (int i = 1; i <= factorial; i++) {
            bigInt = bigInt.multiply(BigInteger.valueOf(i));//String.valueOf(i);
        }
        System.out.println(bigInt);
    }
}
