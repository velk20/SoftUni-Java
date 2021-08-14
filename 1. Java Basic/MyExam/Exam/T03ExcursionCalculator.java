import java.util.Scanner;

public class T03ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double priceForOne = 0.0;
        switch (season) {
            case "spring":
                if (people <= 5) {
                    priceForOne = 50.00;
                } else if (people > 5) {
                    priceForOne = 48.00;
                }
                break;

                case "summer":
                if (people <= 5) {
                    priceForOne = 48.50;
                } else if (people > 5) {
                    priceForOne = 45.00;
                }
                break;

                case "autumn":
                if (people <= 5) {
                    priceForOne = 60.00;
                } else if (people > 5) {
                    priceForOne = 49.50;
                }
                break;

                case "winter":
                if (people <= 5) {
                    priceForOne = 86.00;
                } else if (people > 5) {
                    priceForOne = 85.00;
                }
                break;

        }

        double sum = people * priceForOne;
        if (season.equals("summer")) {
            sum = sum - (sum * 0.15);
        }
        if (season.equals("winter")) {
            sum = sum + (sum * 0.08);
        }

        System.out.printf("%.2f leva.",sum);
    }
}
