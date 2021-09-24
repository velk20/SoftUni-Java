package L03Arrays.Exercise;

import java.util.Scanner;

public class T01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            arr[i] = num;
            sum += num;
        }

        for (int e :
                arr) {
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
