package L04Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double output = calculations(Integer.parseInt(scanner.nextLine()), scanner.nextLine().charAt(0), Integer.parseInt(scanner.nextLine()));

        System.out.println(new DecimalFormat("0.##").format(output));
    }

    public static double calculations( int a,char ope, int b) {
        double re = 0;
        switch (ope) {
            case'-':
                re= a - b;
                break;

            case '+':
                re= a + b;
                break;

            case '*':
                re= a * b;
                break;

            case '/':
                re= a*1.0 / b;
                break;
        }
        return  re;
    }
}
