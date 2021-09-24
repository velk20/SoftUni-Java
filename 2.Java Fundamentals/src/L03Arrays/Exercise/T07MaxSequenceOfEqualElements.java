package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        int value = 0;
//        int curCount ;
//        int maxCount = 0;
//        for (int i = 0; i < nums.length; i++) {
//            curCount = 1;
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                if (nums[i] == nums[j]) {
//                    curCount++;
//                } else break;
//
//                if (curCount > maxCount) {
//                    maxCount = curCount;
//                    value = nums[i];
//                    i += maxCount;
//                }
//            }
//        }
//
//        for (int i = 0; i < maxCount; i++) {
//            System.out.printf("%d ",value );
//        }
    }
}
