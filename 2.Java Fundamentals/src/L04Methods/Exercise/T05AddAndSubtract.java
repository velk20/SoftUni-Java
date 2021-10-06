package L04Methods.Exercise;

import java.util.Scanner;

public class T05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(subtract(sum(a, b), c));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int ab, int c) {
        return ab - c;
    }
}
