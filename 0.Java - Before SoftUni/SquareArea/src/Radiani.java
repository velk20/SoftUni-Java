import java.util.Scanner;

public class Radiani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rad = Double.parseDouble(scan.nextLine());
        System.out.println(rad*180/Math.PI);
    }
}
