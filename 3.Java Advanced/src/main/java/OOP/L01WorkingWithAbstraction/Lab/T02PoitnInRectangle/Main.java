package OOP.L01WorkingWithAbstraction.Lab.T02PoitnInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] initialPoints = readArrayOfInteger(scanner);
        Point bottomLeft = new Point(initialPoints[0], initialPoints[1]);
        Point topRight = new Point(initialPoints[2], initialPoints[3]);
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int[] coordinatesOfPoints = readArrayOfInteger(scanner);
            Point newPoint = new Point(coordinatesOfPoints[0], coordinatesOfPoints[1]);
            System.out.println(rectangle.contains(newPoint));

        }
    }

    private static int[] readArrayOfInteger(Scanner scanner) {
        int[] initialPoints = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        return initialPoints;
    }
}
