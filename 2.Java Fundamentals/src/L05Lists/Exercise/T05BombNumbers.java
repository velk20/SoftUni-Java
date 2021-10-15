package L05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> bombNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] numAndPower = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(detonation(bombNumbers, numAndPower));


    }

    private static int detonation(List<Integer> numbers, int[] numAndPower) {
        int bombNumber = numAndPower[0];
        int bombPower = numAndPower[1];
        int sum = 0;
        while (numbers.contains(bombNumber)) {
            int indexBomb = numbers.indexOf(bombNumber);

            int left = Math.max(0, indexBomb - bombPower);
            int right = Math.min(numbers.size() - 1, indexBomb + bombPower);

            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        return  sum;
    }


}
