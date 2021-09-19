package L02DataTypesandVariables.MoreExercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class T03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstFl = Double.parseDouble(scanner.nextLine());
        double secondFl = Double.parseDouble(scanner.nextLine());
        double epsilon = 0.000001;
        if (secondFl - firstFl < epsilon) {

            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
