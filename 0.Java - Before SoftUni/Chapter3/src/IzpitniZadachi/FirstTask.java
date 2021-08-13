package IzpitniZadachi;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = scanner.nextInt();
        String dayNight = scanner.next().toLowerCase();

        double taxi = 0;
        double bus = 0;
        double train = 0;
        double max1=0;
        double res = 0;

        if (dayNight.equals("day")){
            taxi = taxi + 0.70 + (0.79*kilometers);
        }
        if (dayNight.equals("night")){
            taxi = taxi + 0.70 + (0.90*kilometers);

        }

        if (kilometers>= 20){
            bus = bus + (0.09*kilometers);
        }

        if (kilometers>=100){
            train = train + (0.06*kilometers);
        }

        if (bus != 0) {
             max1 = Math.min(taxi, bus);
        }
        else{
            max1 = taxi;
        }
        if (train != 0) {
             res = Math.min(max1,train);

        }
        else{
            res = max1;

        }

        System.out.println(res);

    }
}
