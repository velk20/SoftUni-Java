import java.util.Scanner;

public class InchToSantimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inches = ");
        Double inches = scan.nextDouble();
        Double centimeters = inches *2.54;
        System.out.print("Centimeters = ");
        System.out.println(centimeters);
    }
}
