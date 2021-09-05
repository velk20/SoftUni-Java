package L02DataTypesandVariables.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class T09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yeld = Integer.parseInt(scanner.nextLine());
        int collect  = 0;
        int days = 0;
        if (yeld >= 100)
        {
            while (yeld >= 100)
            {
                days++;
                collect += yeld;
                yeld -= 10;

            }
            collect -= (days + 1) * 26;
            System.out.println(days);
            System.out.println(collect);
        }
        else
        {
            System.out.println(days);
            System.out.println(collect);
        }

    }
}
