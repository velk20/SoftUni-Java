import java.util.Scanner;

public class T02GodzillvsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSecods = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double a = meters * time;
        double b = (meters / 50) * 30;
        double c = a + b;
        if (recordInSecods < c) {
            System.out.printf("No! He was %.2f seconds slower.", c - recordInSecods);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", c);
        }
    }
}
