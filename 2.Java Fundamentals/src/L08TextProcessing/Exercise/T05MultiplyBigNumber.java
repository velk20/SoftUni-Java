package L08TextProcessing.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class T05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNum = scanner.nextLine();
        String secondNum = scanner.nextLine();

        BigInteger fNum = new BigInteger(firstNum);
        BigInteger secNum = new BigInteger(secondNum);

        System.out.println(fNum.multiply(secNum));

    }

}
