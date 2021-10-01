package L03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int e :
                numbers) {
            if (e % 2 == 0) {
                sum += e;
            }
        }
        System.out.println(sum);
    }
}
