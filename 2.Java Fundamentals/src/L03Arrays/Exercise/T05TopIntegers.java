package L03Arrays.Exercise;

import java.util.*;

public class T05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            boolean flag = true;
            for (int j = i+1; j < nums.length; j++) {
                if (temp <= nums[j]) {
                    flag = false;
                    break;

                }
            }
            if (flag) {
                System.out.print(temp + " ");
            }
        }


    }
}
