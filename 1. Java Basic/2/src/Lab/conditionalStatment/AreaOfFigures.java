package Lab.conditionalStatment;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",Math.pow(a,2));
        } else if (figure.equals("rectangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", b * c);
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",r*r*Math.PI);
        }else if(figure.equals("triangle")){
            double d = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",d*h/2);

        }
    }
}
