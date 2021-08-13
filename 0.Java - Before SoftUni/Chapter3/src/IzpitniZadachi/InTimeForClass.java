package IzpitniZadachi;

import java.util.Scanner;

public class InTimeForClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHours = scanner.nextInt();
        int examMinutes = scanner.nextInt();
        int arriveHours = scanner.nextInt();
        int arriveMinutes = scanner.nextInt();

        String late = "Late";
        String onTime = "On Time";
        String early = "Early";

        int examTime = (examHours * 60) + examMinutes;
        int arrivalTime = (arriveHours * 60) + arriveMinutes;

        int totalMinutesDifference = arrivalTime - examTime;

        String studentArrival = late;

        if (totalMinutesDifference < -30){
            studentArrival = early;
        }else if (totalMinutesDifference <= 0){
            studentArrival = onTime;
        }

        String result = "";
        if (totalMinutesDifference != 0){
            int hoursDifference = Math.abs(totalMinutesDifference / 60);
            int minutesDifference = Math.abs(totalMinutesDifference % 60);

            if (hoursDifference > 0){
                result = String.format("%d:%02d hours",hoursDifference,minutesDifference);
            } else {
                result = minutesDifference + "minutes";
            }

            if (totalMinutesDifference < 0){
                result += " before the start";
            }else {
                result += " after the start";
            }


        }
        System.out.println(studentArrival);
        if (!result.isEmpty()){
            System.out.println(result);
        }
    }
}
