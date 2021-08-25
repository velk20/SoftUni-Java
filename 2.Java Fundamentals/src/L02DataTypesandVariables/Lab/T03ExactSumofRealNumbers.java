package L02DataTypesandVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class T03ExactSumofRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);


        for (int i = 0; i < n; i++) {
            BigDecimal num = scanner.nextBigDecimal();
            sum = sum.add(num);
        }

        System.out.println(sum);
    }
}
