package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr2[i].equals(arr[j])) {
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
