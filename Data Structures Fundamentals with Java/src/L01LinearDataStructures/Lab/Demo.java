package L01LinearDataStructures.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 2, 2, 4, 5, 6, 7, 8, 10));
        numbers.add(13);

        int[]counts = new int[101]; // 0 - 100

        for (Integer number : numbers) {
            counts[number]++;
        }

        for (int number = 0; number <= 100; number++) {
            int count = counts[number];
            for (int i = 0; i < count; i++) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        Collections.sort(numbers);//this works with O(n*log(n)) -> best in Computer science
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
