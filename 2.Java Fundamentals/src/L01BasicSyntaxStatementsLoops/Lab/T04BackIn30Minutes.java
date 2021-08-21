package L01BasicSyntaxStatementsLoops.Lab;

import java.util.Scanner;

public class T04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int afterMinutes = minutes + 30;
        if (afterMinutes > 59) {
            hours++;
            afterMinutes = minutes - 30;
            if (hours > 23) {
                hours = 0;
            }
            if (afterMinutes < 10) {
                System.out.printf("%d:0%d", hours, afterMinutes);

            }else
            System.out.printf("%d:%d", hours, afterMinutes);
        } else {
            System.out.printf("%d:%d", hours, afterMinutes);        }
    }
}
