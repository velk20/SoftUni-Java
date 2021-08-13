package Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForAMeter = Double.parseDouble(scanner.nextLine());

        double time = distance * timeForAMeter;
        double slower = Math.floor(distance / 15);
        slower = slower * 12.5;

        time = time + slower;
        if (record <= time) {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(time-record));
        }
        else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",time);
        }
    }
}
