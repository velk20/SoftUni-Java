package ProgrammingBasicsOnlineExam20and21April2019;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class T03EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String distenation = scanner.nextLine();
        String dates = scanner.nextLine();
        int nightCount = Integer.parseInt(scanner.nextLine());
        double prize = 0;

        switch (distenation) {
            case "France":
                switch (dates) {
                    case "21-23":
                        prize = 30;
                        break;
                    case "24-27":
                        prize = 35;
                        break;
                    case "28-31":
                        prize = 40;
                        break;

                }
break;
                case "Italy":
                switch (dates) {
                    case "21-23":
                        prize = 28;
                        break;
                    case "24-27":
                        prize = 32;
                        break;
                    case "28-31":
                        prize = 39;
                        break;

                }
break;
                case "Germany":
                switch (dates) {
                    case "21-23":
                        prize = 32;
                        break;
                    case "24-27":
                        prize = 37;
                        break;
                    case "28-31":
                        prize = 43;
                        break;

                }
                break;
        }

        System.out.printf("Easter trip to %s : %.2f leva.",distenation,prize*nightCount);
    }
}
