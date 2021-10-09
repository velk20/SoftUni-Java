package L04Methods.MoreExercise;

import java.util.Scanner;

public class T01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataType = scanner.nextLine();
        switch (dataType) {
            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println(intInput(a));

                break;

            case "real":
                double b = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f\n", doubleInput(b));
                break;

            case "string":
                String c = scanner.nextLine();

                stringInput(c);
                break;
        }
    }

    private static void stringInput(String input) {
        System.out.println("$" + input + "$");
    }

    private static double doubleInput(double a) {
        return a * 1.5;
    }

    private static int intInput(int a) {
        return a * 2;
    }
}
