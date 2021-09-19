package L02DataTypesandVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < n; i++) {
            BigDecimal currentNumber = new BigDecimal(scanner.nextLine());
            sum = sum.add(currentNumber);
        }

        System.out.println(sum);

    }
}
