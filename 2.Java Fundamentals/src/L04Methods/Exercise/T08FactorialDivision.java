package L04Methods.Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T08FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstDigit=Integer.parseInt(sc.nextLine());
        int secondDigit=Integer.parseInt(sc.nextLine());
        System.out.printf("%.2f",1.0*factorial(firstDigit)/factorial(secondDigit));
    }

    static long factorial(int digit){
        long fact=1;
        for (int i=2;i<=digit;i++){
            fact=fact*i;
        }
        return fact;
    }
}
