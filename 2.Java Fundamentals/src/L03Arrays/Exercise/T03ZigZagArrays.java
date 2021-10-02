package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrEven = new int[n];
        int[] arrOdd = new int[n];

        for (int i = 0; i < n; i++) {
            int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                arrEven[i] = nums[0];
                arrOdd[i] = nums[1];

            } else {
                arrEven[i] = nums[1];
                arrOdd[i] = nums[0];
            }
        }

        for (int e : arrEven){
            System.out.print(e+" ");
        }
        System.out.println();
        for (int e : arrOdd){
            System.out.print(e+" ");
        }

    }
}
