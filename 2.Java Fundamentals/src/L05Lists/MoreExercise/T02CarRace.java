package L05Lists.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> time =
                Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        double leftCarSum = 0;
        double rightCarSum = 0;

        for (int i = 0; i < time.size() / 2; i++)
        {
            if (time.get(i).equals(0)) {

                leftCarSum *= 0.8;
            } else {
                leftCarSum += time.get(i);
            }

            if (time.get(time.size() - i - 1).equals(0))
            {
                rightCarSum *= 0.8;
            }
            else
            {
                rightCarSum +=time.get( time.size() - i - 1);
            }
        }
        if (leftCarSum <= rightCarSum) {
            System.out.printf("The winner is left with total time: %.1f", leftCarSum);
        }else System.out.printf("The winner is right with total time: %.1f", rightCarSum);
    }
}
