import java.util.Scanner;

public class T04GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double sumLiters = 0.0;
        double gradusite = 0.0;
        for (int i = 0; i < days; i++) {
            double rakia = Double.parseDouble(scanner.nextLine());
            double gradus = Double.parseDouble(scanner.nextLine());
            sumLiters += rakia;
            double sbor = rakia * gradus;
            gradusite += sbor;
        }
        double finale = gradusite / sumLiters;
        System.out.printf("Liter: %.2f\n",sumLiters);
        System.out.printf("Degrees: %.2f\n", finale);
        if (finale < 38) {
            System.out.println("Not good, you should baking!");
        } else if (finale >= 38 && finale <= 42) {
            System.out.println("Super!");
        } else if (finale > 42) {
            System.out.println("Dilution with distilled water!");
        }
    }
}
