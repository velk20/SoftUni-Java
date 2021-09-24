package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (counter % 2 == 0) {
                arr[i] = input[0];
                arr2[i] = input[1];
            } else {
                arr[i] = input[1];
                arr2[i] = input[0];
            }


            counter++;
        }

        for (int e :
                arr) {
            System.out.print(e+" ");
        }
        System.out.println();
        for (int e :
                arr2) {
            System.out.print(e+" ");
        }

    }
}
