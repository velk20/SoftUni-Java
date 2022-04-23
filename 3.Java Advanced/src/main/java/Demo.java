import java.util.Scanner;

public  class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter the three sides of a triangle");
        System.out.print("a = ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("b = ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("c = ");
        int c = Integer.parseInt(scanner.nextLine());

        if (!checkForValidTriangle(a, b, c)) {
            System.out.println("This triangle is NOT valid");
            return;
        }

        if (checkForEquilateralTriangle(a, b, c)) {
            System.out.println("The triangle is Equilateral");

        } else if (checkForIsoscelesTriangle(a, b, c)) {
            System.out.println("The triangle is Isosceles");

        } else System.out.println("The triangle is Scalene");

        if (checkForRectangularTriangle(a, b, c)) {
            System.out.println("Also the triangle is Rectangular");

        }



    }

    public static boolean checkForRectangularTriangle(int a, int b, int c) {
        return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) ||
                (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) ||
                (Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2));
    }


    public static boolean checkForEquilateralTriangle(int a, int b, int c) {
        return a == b && a == c;
    }

    public static boolean checkForIsoscelesTriangle(int a, int b, int c) {
        return (a == b) || (b == c) || (c == a);
    }
    public static boolean checkForValidTriangle(int a, int b, int c) {
        return a + b > c &&
                b + c > a &&
                c + a > b;
    }

}
