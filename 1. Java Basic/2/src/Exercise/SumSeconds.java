package Exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int tri = Integer.parseInt(scanner.nextLine());

        int sum = one + two + tri;
        int minutes = sum / 60;
        int seconds = sum % 60;

        if (seconds<10) {
//            System.out.printf("%d:0%d",minutes,seconds);
         System.out.printf("%d:%02d",minutes,seconds);
        }else System.out.printf("%d:%d",minutes,seconds);
    }
}
