package Lab;

import java.util.Scanner;

public class T08CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println("12");
                break;
            case "Thursday":
            case "Wednesday":
                System.out.println("14");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("16");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
