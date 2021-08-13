package Exercise;

import java.util.Scanner;

public class T09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String leapOrNot = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int sofia = 48 - h;
        double inSofia = sofia * 3 / 4.0;

        double Velikden = p * 2 / 3.0;

        double all = inSofia+Velikden+h;
        double leap = 0.0;
        if (leapOrNot.equals("leap")) {
            leap = all * 0.15;
            all = all + leap;
        }
        System.out.printf("%.0f",Math.floor(all));
    }
}
