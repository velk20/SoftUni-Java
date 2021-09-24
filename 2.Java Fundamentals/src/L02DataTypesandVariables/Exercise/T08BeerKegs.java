package L02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class T08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        String maxString = "";
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());
            // π * r^2 * h.
            double V = Math.PI * Math.pow(r, 2) * h;
            if (V > max) {
                max = V;
                maxString = name;
            }


        }

        System.out.println(maxString);
    }
}
