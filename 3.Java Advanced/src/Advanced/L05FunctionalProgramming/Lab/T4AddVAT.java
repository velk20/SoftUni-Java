package Advanced.L05FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class T4AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double::parseDouble).toArray();

        UnaryOperator<Double> addVAT = e -> e * 1.2;
        System.out.println("Prices with VAT:");
        Arrays.stream(nums)
                .map(addVAT::apply)
                .forEach(e->System.out.printf("%.2f\n",e));


    }
}
