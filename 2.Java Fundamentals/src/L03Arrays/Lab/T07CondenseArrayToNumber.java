package L03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (nums.length >1) {

            int[] ziped = new int[nums.length - 1];
            while (ziped.length != 1) {
                for (int i = 0; i < nums.length; i++) {
                    if (i != nums.length - 1) {
                        ziped[i] = nums[i] + nums[i + 1];
                    }
                }
                nums = ziped;
                ziped = new int[nums.length - 1];
            }
            System.out.println(nums[0] + nums[1]);
        } else {
            System.out.println(nums[0]);
        }
    }
}
