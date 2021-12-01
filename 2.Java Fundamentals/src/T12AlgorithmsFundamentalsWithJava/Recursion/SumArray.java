package T12AlgorithmsFundamentalsWithJava.Recursion;

import javax.print.attribute.standard.NumberUpSupported;
import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        System.out.println("Iteration sum: "+sum);

        sum = sumNumbers(arr, 0);

        System.out.println("Recursion sum: "+sum);
    }

    private static int sumNumbers(int[] arr,int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + sumNumbers(arr, index + 1);
    }
}
