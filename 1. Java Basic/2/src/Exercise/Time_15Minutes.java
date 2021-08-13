package Exercise;

import java.util.Scanner;

public class Time_15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hour = Double.parseDouble(scanner.nextLine());
        double minute = Double.parseDouble(scanner.nextLine());

        double after15 = minute + 15;
        double afterMinutes = 0;

            if (minute >= 45) {
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
                afterMinutes = after15 % 60;
                if (afterMinutes<10)
                System.out.printf("%.0f:0%.0f", hour, afterMinutes);
                else
                    System.out.printf("%.0f:%.0f", hour, afterMinutes);

            } else {
                System.out.printf("%.0f:%.0f", hour, after15);

            }


    }
}
