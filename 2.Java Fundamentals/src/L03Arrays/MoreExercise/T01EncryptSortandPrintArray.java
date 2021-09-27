package L03Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class T01EncryptSortandPrintArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            int len = input.length();
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                boolean upper = Character.isLowerCase(c);
                if (upper) {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        sum += ((int) c * len);
                    } else {
                        sum += ((int) c / len);
                    }
                } else {
                    if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                        sum += ((int) c * len);
                    } else {
                        sum += ((int) c / len);
                    }
                }
            }
            arr[i] = sum;
            sum = 0;
        }
        Arrays.sort(arr);
        for (int e :
                arr) {
            System.out.println(e);
        }

    }
}
