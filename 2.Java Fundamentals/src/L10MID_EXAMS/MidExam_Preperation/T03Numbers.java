package L10MID_EXAMS.MidExam_Preperation;

import java.util.*;

public class T03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> topIntegers = new ArrayList<>();

        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            sum += currNum;
        }
        double avg = sum / nums.length;

        for (int i = 0; i < nums.length; i++) {
            int curNum = nums[i];
            if (curNum > avg) {
                topIntegers.add(curNum);
            }
        }

        Collections.sort(topIntegers);
        Collections.reverse(topIntegers);


            if (topIntegers.size() > 5) {
                for (int i = 0; i < 5; i++) {
                    System.out.printf("%d ", topIntegers.get(i));
                }
            } else if (topIntegers.isEmpty()) {
                System.out.println("No");
            } else {
                System.out.println(topIntegers.toString().replaceAll("[\\[\\],]", ""));

            }
        }


    }

