import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double C = Double.parseDouble(scan.nextLine());

        System.out.println(C*1.8+32);
    }
}
