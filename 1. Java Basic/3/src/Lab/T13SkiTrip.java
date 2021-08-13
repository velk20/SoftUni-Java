package Lab;

import java.util.Scanner;

public class T13SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String feedback = scanner.nextLine();
        double res = 0;
        switch (room) {
            case "room for one person":
                res = (days - 1) * 18;
                if (feedback.equals("positive")) {
                    res = res + (res * 0.25);
                } else if (feedback.equals("negative")) {
                    res = res - (res * 0.1);
                }
                System.out.printf("%.2f",res);
                break;
            case "apartment":
                res = (days - 1) * 25;
                if (days < 10) {
                    res = res - (res * 0.3);
                } else if (days >= 10 && days <= 15) {
                    res = res - (res * 0.35);
                } else if (days > 15) {
                    res = res - (res * 0.5);
                }

                if (feedback.equals("positive")) {
                    res = res + (res * 0.25);
                } else if (feedback.equals("negative")) {
                    res = res - (res * 0.1);
                }
                System.out.printf("%.2f",res);
                break;
            case "president apartment":
                res = (days - 1) * 35;
                if (days < 10) {
                    res = res - (res * 0.1);
                } else if (days >= 10 && days <= 15) {
                    res = res - (res * 0.15);
                } else if (days > 15) {
                    res = res - (res * 0.2);
                }

                if (feedback.equals("positive")) {
                    res = res + (res * 0.25);
                } else if (feedback.equals("negative")) {
                    res = res - (res * 0.1);
                }
                System.out.printf("%.2f",res);
                break;
        }
    }
}
