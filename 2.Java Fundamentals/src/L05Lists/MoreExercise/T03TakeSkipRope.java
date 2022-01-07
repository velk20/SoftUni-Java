package L05Lists.MoreExercise;

import java.util.*;

public class T03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = new ArrayList<>();
        List<String> nonDigits = new ArrayList<>();

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digits.add(Integer.parseInt(String.valueOf(ch)));
            } else {
                nonDigits.add(String.valueOf(ch));
            }
        }

        for (int i = 0; i < digits.size(); i++) {
            if (i % 2 == 0) {
                even.add(digits.get(i));
            } else {
                odd.add(digits.get(i));
            }
        }

        String string = nonDigits.toString().replaceAll("[, \\[\\]]","");

        takePartsOfString(string, even, odd);
    }

    private static void takePartsOfString(String string, List<Integer> takeList, List<Integer> skipList) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < takeList.size(); i++) {
            int take = takeList.get(i);
            for (int j = 0; j < take; j++) {
                if (string.length() == 0) {
                    break;
                }
                newString.append(string.charAt(0));
                string = string.substring(1);
            }

            for (int j = 0; j < skipList.get(i); j++) {

                if (string.length() == 0) {
                    break;
                }
                string = string.substring(1);
            }
        }
        System.out.println(newString);
    }
}
