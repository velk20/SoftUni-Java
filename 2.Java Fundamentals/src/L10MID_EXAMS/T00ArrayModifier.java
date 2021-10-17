package L10MID_EXAMS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T00ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            int indexOne;
            int indexTwo;
            switch (tokens[0]) {
                case "swap":
                     indexOne = Integer.parseInt(tokens[1]);
                     indexTwo = Integer.parseInt(tokens[2]);
                    swap(nums, indexOne, indexTwo);
                    break;
                case "multiply":
                     indexOne = Integer.parseInt(tokens[1]);
                     indexTwo = Integer.parseInt(tokens[2]);
                    multiply(nums, indexOne, indexTwo);
                    break;
                case "decrease":
                    decrease(nums);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(nums.toString().replaceAll("[\\[\\]]",""));
    }

    private static void decrease(List<Integer> nums) {
        nums.replaceAll(e -> e - 1);
    }

    private static void multiply(List<Integer> nums, int indexOne, int indexTwo) {
        nums.set(indexOne, nums.get(indexOne) * nums.get(indexTwo));
    }

    private static void swap(List<Integer> nums, int indexOne, int indexTwo) {
        int temp = nums.get(indexOne);
        nums.set(indexOne, nums.get(indexTwo));
        nums.set(indexTwo, temp);
    }
}
