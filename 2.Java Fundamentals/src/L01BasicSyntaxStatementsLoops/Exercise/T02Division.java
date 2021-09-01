package L01BasicSyntaxStatementsLoops.Exercise;

import java.util.Scanner;
/*You will be given an integer and you have to print on the console whether that number is divisible by the following
 numbers: 2, 3, 6, 7, 10. You should always take the bigger division. If the number is divisible by both 2 and 3 it
 is also divisible by 6 and you should print only the division by 6. If a number is divisible by 2 it is sometimes also divisible by 10 and you should print the division by 10. If the number is not divisible by any of the given numbers print “Not divisible”. Otherwise print "The number is divisible by {number}".*/

public class T02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = 0;
        if (a % 2 == 0) {
            b=2;
        }  if (a % 3 == 0) {
            b = 3;
        }
        if (a % 6 == 0) {
            b = 6;

        } if (a % 7 == 0) {
            b = 7;
        }
        if (a % 10 == 0) {
            b = 10;
        }

        if (b != 0) {
            System.out.printf("The number is divisible by %d", b);
        } else {
            System.out.printf("Not divisible");
        }
    }
}
