package Lab;

import java.util.Scanner;

public class T04Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
, и отпечатва всички числа ≤ n от редицата: 1, 3, 7, 15, 31, …. Всяко следващо число се изчислява като умножим предишното с 2 и добавим 1.
*/

        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
            while (i <= n) {
                System.out.println(i);
                i = (i*2)+1;
            }

    }

}
