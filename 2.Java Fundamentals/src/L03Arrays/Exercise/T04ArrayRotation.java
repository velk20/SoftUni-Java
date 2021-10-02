package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotaitions = Integer.parseInt(scanner.nextLine());
//        int[] temps = new int[nums.length];
//            while (rotaitions != 0) {
//                for (int i = 0; i < nums.length; i++) {
//                    var firstTemp = nums[0];
//                    if (i != nums.length - 1) {
//
//                        temps[i] = nums[i + 1];
//                    } else {
//
//                        temps[i] = firstTemp;
//                    }
//                }
//                nums = temps;
//                temps=new int[nums.length];
//
//                rotaitions--;
//            }


        //#2 version
        for (int i = 1; i <= rotaitions; i++) {

            int firstNum = nums[0];

            for (int j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1];
            }

            nums[nums.length - 1] = firstNum;
        }


        for (int e :
                nums) {
            System.out.print(e + " ");
        }

    }
}
