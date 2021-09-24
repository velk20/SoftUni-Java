package L02DataTypesandVariables.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class T01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //!!!! WITH BIG INTEGERS
//        BigInteger a = scanner.nextBigInteger();
//        BigInteger b = scanner.nextBigInteger();
//        BigInteger c = scanner.nextBigInteger();
//        BigInteger d = scanner.nextBigInteger();
//
//        BigInteger sum ;
//        sum = a.add(b);
//
//        BigInteger dev;
//        dev = sum.divide(c);
//
//        BigInteger as;
//        as = dev.multiply(d);
//
//        System.out.println(as);

        //with INT from EXERCISES
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        int res = ((a + b) / c) * d;
        System.out.println(res);

    }
}
