package L02DataTypesandVariables.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class T01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger c = scanner.nextBigInteger();
        BigInteger d = scanner.nextBigInteger();

        BigInteger sum ;
        sum = a.add(b);

        BigInteger dev;
        dev = sum.divide(c);

        BigInteger as;
        as = dev.multiply(d);

        System.out.println(as);

    }
}
