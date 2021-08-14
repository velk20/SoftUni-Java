import java.util.Scanner;

public class T01Oscarsceremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());
        double student = tax - (tax * 0.3);
        double ketyr = student - (student * 0.15);
        double oz = ketyr / 2;

        double sum = tax + student + ketyr + oz;
        System.out.printf("%.2f",sum);

    }
}
