package Exercise;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class T08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int arriveHours = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examSeconds = (hours * 3600) + (minutes * 60);
        int arriveSeconds = (arriveHours * 3600) + (arriveMinutes * 60);

        int lateOrNot = examSeconds - 1800;
        int diff = 0;
        if (examSeconds < arriveSeconds) {
            diff = (arriveSeconds - examSeconds) / 60;
            System.out.println("Late");
            if (diff <= 59) {

                System.out.printf("%d minutes after the start", diff);

            } else {
                if (diff % 60 < 10)
                    System.out.printf("%d:0%d hours after the start", (diff / 60), (diff % 60));
                else
                    System.out.printf("%d:%d hours after the start", (diff / 60), (diff % 60));
            }

        } else if (arriveSeconds >= lateOrNot && arriveSeconds <= examSeconds) {
            System.out.println("On time");
            if (arriveSeconds != examSeconds) {
                diff = (examSeconds - arriveSeconds) / 60;
                System.out.printf("%d minutes before the start", diff);
            }
        } else if (arriveSeconds < examSeconds) {


            diff = Math.abs((arriveSeconds - examSeconds) / 60);
            System.out.println("Early");
            if (diff <= 59) {
                System.out.printf("%d minutes before the start", diff);

            } else {
                if (diff % 60 < 10)
                    System.out.printf("%d:0%d hours before the start", (diff / 60), (diff % 60));
                else
                    System.out.printf("%d:%d hours before the start", (diff / 60), (diff % 60));
            }
        }

    }
}
