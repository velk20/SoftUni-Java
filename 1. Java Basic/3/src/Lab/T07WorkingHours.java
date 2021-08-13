package Lab;

import java.util.Scanner;
//от 10-18 часа, от понеделник до събота включително
public class T07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hours >= 10 && hours <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            default:
                System.out.println("closed");
                break;
        }
    }
}
