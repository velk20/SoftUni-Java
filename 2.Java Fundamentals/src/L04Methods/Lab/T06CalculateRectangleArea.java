package L04Methods.Lab;

import java.util.Scanner;

public class T06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = rectangleArea(Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()));
        System.out.printf("%.0f\n",area);
    }

    public static double rectangleArea(double a,double b) {
        return a * b;
    }
}
