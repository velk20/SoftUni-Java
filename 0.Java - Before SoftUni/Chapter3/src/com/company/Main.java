package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double bonus = 0 ;

        if (a %2 == 0)
            bonus=1;
        else if (a%5==0)
            bonus=2;

        if (a<= 100)
            bonus+=5;
        else if (a>100 && a<=1000)
            bonus += a*0.2;
        else    if (a>100)
            bonus += a*0.1;


        System.out.println(bonus);
        System.out.println(a+bonus);

    }
}
