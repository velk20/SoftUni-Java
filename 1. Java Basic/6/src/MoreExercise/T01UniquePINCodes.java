package MoreExercise;

import java.util.Scanner;

public class T01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int e = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= q; i++) {
            for (int j = 2; j <= w; j++) {
                for (int ek = 1; ek <= e; ek++) {
                    if (i%2==0 && ek%2==0 && isPrime(j)) {
                        System.out.printf("%d %d %d\n",i,j,ek);
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
