package L02DataTypesandVariables.Lab;

import java.util.Scanner;

public class T09CenturiestoMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double b = a * 100.0;
        double c = b * 365.2422;
        double d = c * 24.0;
        double e = d * 60.0;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",a,b,c,d,e);
    }
}
