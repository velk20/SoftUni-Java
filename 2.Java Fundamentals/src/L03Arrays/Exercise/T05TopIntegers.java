package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            var temp = nums[i];
            boolean flag = true;
            for (int j = i+1; j < nums.length; j++) {
                if (temp > nums[j]) {

                }else{
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
