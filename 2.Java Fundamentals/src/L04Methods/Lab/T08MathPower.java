package L04Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class T08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double output = mathPower(Double.parseDouble(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
        System.out.println(new DecimalFormat("0.####").format(output));    }

    public static double mathPower(double a, int b) {
        return Math.pow(a, b);
    }



}
