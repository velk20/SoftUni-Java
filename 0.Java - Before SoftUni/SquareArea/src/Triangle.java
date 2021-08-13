import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        System.out.println( (a*h/2));
    }
}
