package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
            sum += arr[i];
        }

        for (int e :
                arr) {
            System.out.print(e+" ");
        }
        System.out.printf("\n%d\n", sum);
        System.out.println(Arrays.stream(arr).sum()); // FUNCTIONAL SUM !!!!
    }
}
