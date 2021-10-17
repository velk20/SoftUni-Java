package L10MID_EXAMS.MidExam_Preperation;

import java.util.*;

public class T03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> topIntegers = new ArrayList<>();

        double average = Arrays.stream(nums).sum();
        average = average / nums.length;

        for (int num : nums) {
            if (num > average) {

                topIntegers.add(num);
            }
        }
        Collections.sort(topIntegers);
        Collections.reverse(topIntegers);

        if (topIntegers.size() < 2) {
            System.out.println("No");
        } else {
            if (topIntegers.size() <= 5) {

                System.out.println(topIntegers.toString().replaceAll("[\\[\\],]", ""));
            } else {
                for (int i = 0; i < 5; i++) {
                    System.out.printf("%d ", topIntegers.get(i));
                }
            }
        }


    }
}
