package L10MID_EXAMS.T03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02ShootfortheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int counter = 0;
        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            if (index >= 0 && index < nums.size()) {
                if (!nums.get(index).equals(-1)) {
                    int num = nums.get(index);
                    nums.set(index, -1);
                    counter++;


                    for (int i = 0; i < nums.size() ; i++) {
                        int n = nums.get(i);
                        if (n != -1 && n > num) {
                            nums.set(i, n - num) ;
                        } else if (n <= num && n != -1) {
                            nums.set(i, n + num);
                        }
                    }

                }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",counter);
        System.out.println(nums.toString().replaceAll("[\\[\\],]",""));
    }
}
