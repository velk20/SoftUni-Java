package MoreExercise;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double taxi = 0;
        double bus = 0;
        double train = 0;

        if (distance < 20) {
            taxi = 0.70;
            if (dayOrNight.equals("day")) {
                taxi += 0.79 * distance;
            } else if (dayOrNight.equals("night")) {
                taxi += 0.90 * distance;
            }
        } else if (distance >= 20 && distance < 100) {
            bus += 0.09 * distance;
        } else if(distance>=100){
            train += 0.06 * distance;
        }
        double temp, smallest;
        temp = taxi > bus ? taxi : bus;
        smallest = train > temp ? train : temp;
        System.out.printf("%.2f",smallest);
//        System.out.printf("%.2f",Math.max(taxi,Math.max(bus,train)));


    }
}
