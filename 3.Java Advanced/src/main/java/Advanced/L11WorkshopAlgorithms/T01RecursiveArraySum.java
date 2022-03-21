package Advanced.L11WorkshopAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class T01RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(recursiveArrSum(arr,0));
    }

    private static int recursiveArrSum(int[] arr,int n) {
        if (n == arr.length) {
            return 0;
        }
       return arr[n]+ recursiveArrSum(arr, n + 1);
    }
}
