package T12AlgorithmsFundamentalsWithJava.Recursion.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T01RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(sumOfArray(array, 0));
    }

    static int sumOfArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index]+sumOfArray(arr,index+1);

    }
}
