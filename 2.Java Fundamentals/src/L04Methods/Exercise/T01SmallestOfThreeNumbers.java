package L04Methods.Exercise;

import java.util.Scanner;

public class T01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int min = minNumber(a, b, c);
        int min2 = Math.min(a,Math.min(b,c));
        System.out.println(min);
        System.out.println(min2);
    }

    public static int minNumber(int a, int b, int c) {
        int smallest = Integer.MAX_VALUE;
//        if(a<b) {
//            if(c<a) {
//                smallest = c;
//            } else {
//                smallest = a;
//            }
//        } else {
//            if(b<c) {
//                smallest = b;
//            } else {
//                smallest = c;
//            }
//        }

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        }else smallest = c;

        return smallest;
    }

}
