import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'r' of circle = ");
        int r = Integer.parseInt(scan.nextLine());
        System.out.println("Area = " + (Math.PI*r*r));
        System.out.println("Perimeter = " +(2*Math.PI*r));
    }
}
