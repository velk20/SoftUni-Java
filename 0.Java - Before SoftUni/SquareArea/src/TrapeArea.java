import java.util.Scanner;

public class TrapeArea {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                double b1 = Double.parseDouble(scan.nextLine());
                double b2 = Double.parseDouble(scan.nextLine());
                double h = Double.parseDouble(scan.nextLine());
                double area = (b1+b2)*h /2.0;
                System.out.println("Trapezoid area = "+area);



    }
}
