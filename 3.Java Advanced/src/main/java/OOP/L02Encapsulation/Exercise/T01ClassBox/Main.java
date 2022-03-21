package OOP.L02Encapsulation.Exercise.T01ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double len = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box = null;
        try {
            box = new Box(len, width, height);
            System.out.printf("Surface Area - %.2f\n", box.calculateSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f\n", box.calculateLateralSurfaceArea());
            System.out.printf("Volume – %.2f\n", box.calculateVolume());
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
