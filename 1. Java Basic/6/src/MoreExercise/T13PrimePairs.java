package MoreExercise;

import java.util.Scanner;

public class T13PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startF = Integer.parseInt(scanner.nextLine());
        int startL = Integer.parseInt(scanner.nextLine());
        int rezF = Integer.parseInt(scanner.nextLine());
        int rezL = Integer.parseInt(scanner.nextLine());

        int endF = startF + rezF;
        int endL = startL + rezL;

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        String first = "" + i + j;
                        String least = "" + k + l;
                        int numFirst = Integer.parseInt(first);
                        int numLast = Integer.parseInt(least);
                        if (numFirst>=startF && numFirst<=endF && numLast>=startL &&numLast<=endL && isPrime(numFirst) && isPrime(numLast)) {
                            String num = first + least;
                            int finalNum = Integer.parseInt(num);
                            System.out.printf("%d\n", finalNum);
                        }

                    }
                }
            }
        }
    }
    static boolean isPrime(int n)
    {

        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
