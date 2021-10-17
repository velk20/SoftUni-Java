package L05Lists.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T01Messaging {
    public static void main(String[] args) {
        //9992 562 8933
        //This is some message for you

        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        StringBuilder message = new StringBuilder(scanner.nextLine());
        String output = "";
        for (int i = 0; i < nums.size(); i++) {
            int sumOfDigits = 0;
            int num = nums.get(i);
            while(num > 0)
            {
                int digit = num % 10;
                sumOfDigits += digit;
                num = num / 10;
            }
            int index = sumOfDigits;//29
            if (index >= message.length()) {
                index = index - message.length();
            }
            output += message.charAt(index);

            message.deleteCharAt(index);

        }

        System.out.println(output);
    }
}
