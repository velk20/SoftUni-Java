package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotaitions = Integer.parseInt(scanner.nextLine());
        int[] temps = new int[nums.length];
            while (rotaitions != 0) {
                for (int i = 0; i < nums.length; i++) {
                    var firstTemp = nums[0];
                    if (i != nums.length - 1) {

                        temps[i] = nums[i + 1];
                    } else {

                        temps[i] = firstTemp;
                    }
                }
                nums = temps;
                temps=new int[nums.length];

                rotaitions--;
            }
        for (int e :
                nums) {
            System.out.print(e + " ");
        }

    }
}
