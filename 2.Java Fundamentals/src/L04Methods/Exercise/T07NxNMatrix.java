package L04Methods.Exercise;

import java.util.Scanner;

public class T07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        square(Integer.parseInt(scanner.nextLine()));
    }

    public static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ",n);
            }
            System.out.println();
        }
    }
}
