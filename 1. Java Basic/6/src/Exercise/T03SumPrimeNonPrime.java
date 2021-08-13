package Exercise;

import java.util.Scanner;

public class T03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumStupid = 0;
        int sumNOTStupid = 0;
        while (!input.equals("stop")) {

            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
            }else{

                if (isPrime(num)) {
                    sumStupid += num;

                } else sumNOTStupid += num;
            }



            input = scanner.nextLine();
        }


        System.out.printf("Sum of all prime numbers is: %d\n",sumStupid);
        System.out.printf("Sum of all non prime numbers is: %d",sumNOTStupid);

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
