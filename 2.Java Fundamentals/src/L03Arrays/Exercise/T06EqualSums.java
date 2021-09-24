package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean flag = true;
        if (nums.length == 1) {
            System.out.println(0);
            flag = false;
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            int rightSum = 0;
            for (int j = i+1; j < nums.length ; j++) {
                rightSum+=nums[j];

            }

            if (leftSum == rightSum) {
                System.out.println(i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("no");

        }



    }




}
